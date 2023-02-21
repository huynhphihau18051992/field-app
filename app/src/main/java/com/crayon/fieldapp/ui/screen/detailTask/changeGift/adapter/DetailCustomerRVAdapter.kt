package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest
import com.crayon.fieldapp.data.remote.request.AddPromotionRequest
import com.crayon.fieldapp.data.remote.request.ProjectGiftRequest
import com.crayon.fieldapp.data.remote.request.ProjectProductRequest
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import kotlinx.android.synthetic.main.item_bill_info.view.*
import kotlinx.android.synthetic.main.item_customer_info.view.*
import kotlinx.android.synthetic.main.item_gift_info.view.*
import kotlinx.android.synthetic.main.item_promotion_info.view.*

class DetailCustomerRVAdapter constructor(
    val images: ArrayList<MediaData>,
    val promotions: ArrayList<PromotionResponse>,
    val gifts: ArrayList<GiftResponse>,
    var customerName: String,
    var customerPhone: String,
    var codeBill: String,
    val context: Context,
    val onItemPromotionSelectClick: (item: PromotionResponse, isChecked: Boolean) -> Unit = { promotion: PromotionResponse, b: Boolean -> },
    val onItemPromotionAddClick: (item: PromotionResponse) -> Unit = { },
    val onItemPromotionEditClick: (item: PromotionResponse) -> Unit = { },
    val onItemPromotionMinusClick: (item: PromotionResponse) -> Unit = { },
    val onItemImageClick: (item: MediaData) -> Unit = { },
    val isEdit: Boolean = true
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var mImageAdapter: BillImageRVAdapter
    private lateinit var mPromotionRVAdapter: PromotionRVAdapter
    private lateinit var mGiftRVAdapter: GiftRVAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v: View
        when (viewType) {
            R.layout.item_customer_info -> {
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.item_customer_info, parent, false)
                return CustomerItemViewHolder(view)
            }
            R.layout.item_bill_info -> {
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.item_bill_info, parent, false)
                return BillItemViewHolder(view)
            }
            R.layout.item_promotion_info -> {
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.item_promotion_info, parent, false)
                return PromotionItemViewHolder(view)
            }
            else -> {
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.item_gift_info, parent, false)
                return GiftItemViewHolder(view)
            }
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CustomerItemViewHolder) {
            holder.txtName.text = customerName
            holder.txtPhone.text = customerPhone

        } else if (holder is BillItemViewHolder) {
            holder.txtBill.text = codeBill.replace("\"", "")
            mImageAdapter = BillImageRVAdapter(images, context, onItemImageClick = {
                onItemImageClick(it)
            })
            holder.rvImages.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                this.adapter = mImageAdapter
            }
        } else if (holder is PromotionItemViewHolder) {
            mPromotionRVAdapter = PromotionRVAdapter(
                items = promotions,
                context = context,
                onCheckBoxSelect = { promotion, isChecked ->
                    if (isChecked) {
                        onItemPromotionSelectClick(promotion, isChecked)
                        mPromotionRVAdapter.onSelectItem(promotion)
                    } else {
                        mPromotionRVAdapter.onUnSelectItem(promotion)
                    }
                }, onItemDeleteListener = { mPromotion ->
                    unSelectPromotionItem(mPromotion)
                    mPromotionRVAdapter.onDeleteAllProduct(mPromotion)
                }, onItemPlusListener = { mPromotion ->
                    onItemPromotionAddClick(mPromotion)
                }, onItemMinusListener = { mPromotion ->
                    onItemPromotionMinusClick(mPromotion)
                }, onItemEditListener = { mPromotion ->
                    onItemPromotionEditClick(mPromotion)
                }, isEdit = isEdit
            )
            holder.rvPromotion.apply {
                layoutManager = LinearLayoutManager(context)
                this.adapter = mPromotionRVAdapter
            }
        } else {
            mGiftRVAdapter =
                GiftRVAdapter(
                    items = gifts,
                    context = context,
                    onItemSelectedListener = { mGift, isChecked ->
                        if (isChecked) {
                            mGiftRVAdapter.onSelectItem(mGift)
                        } else {
                            mGiftRVAdapter.onUnSelectItem(mGift)
                        }
                    },
                    onItemMinusListener = { mGift ->
                        var quantity = mGift.selectQuantity - 1
                        if (quantity < 0) {
                            quantity = 0
                        }
                        mGiftRVAdapter.onUpdateQuantity(mGift, quantity)
                    },
                    onItemPlusListener = { mGift ->
                        var quantity = mGift.selectQuantity + 1
                        mGiftRVAdapter.onUpdateQuantity(mGift, quantity)
                    }, isEdit = isEdit
                )
            (holder as GiftItemViewHolder).rvGift.apply {
                layoutManager = LinearLayoutManager(context)
                this.adapter = mGiftRVAdapter
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> R.layout.item_customer_info
            1 -> R.layout.item_bill_info
            2 -> R.layout.item_promotion_info
            else -> R.layout.item_gift_info
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var icEdit: ImageView
        var txtName: TextView
        var txtPhone: TextView
        var txtDate: TextView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_customer_num)
            icEdit = itemView.findViewById(R.id.img_edit)
            txtName = itemView.findViewById(R.id.txt_name)
            txtPhone = itemView.findViewById(R.id.txt_phone)
            txtDate = itemView.findViewById(R.id.txt_date)
        }
    }

    inner class CustomerItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtName: TextView = view.txt_customer_name
        var txtPhone: TextView = view.txt_customer_phone
    }

    inner class BillItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvImages: RecyclerView = view.rv_images
        var txtBill: TextView = view.txt_bill
    }

    inner class PromotionItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvPromotion: RecyclerView = view.rv_promotion
    }

    inner class GiftItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvGift: RecyclerView = view.rv_gift
    }

    fun addData(
        mImages: ArrayList<MediaData>,
        mPromotions: ArrayList<PromotionResponse>,
        mGift: ArrayList<GiftResponse>,
        mCodeBill: String

    ) {
        images.clear()
        images.addAll(mImages)

        promotions.clear()
        promotions.addAll(mPromotions)

        gifts.clear()
        gifts.addAll(mGift)
        codeBill = mCodeBill

        notifyDataSetChanged()
    }

    fun updatePromotionQuantity(item: PromotionResponse, quantity: Int) {
        promotions.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                promotions.get(index).quantity = quantity
                notifyItemChanged(2)
            }
        }
    }

    fun updateGiftQuantity(item: GiftResponse, quantity: Int) {
        gifts.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                gifts.get(index).quantity = quantity
                notifyItemChanged(3)
            }
        }
    }

    fun selectPromotionItem(data: PromotionResponse) {
        promotions.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = true
            if (it.quantity < 1) {
                it.quantity = 1
            }
            notifyItemChanged(2)
        }
    }

    fun unSelectPromotionItem(data: PromotionResponse) {
        promotions.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = false
            it.quantity = 0
            notifyItemChanged(2)
        }
    }

    fun selectGiftItem(data: GiftResponse) {
        gifts.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = true
            if (it.quantity < 1) {
                it.quantity = 1
            }
            notifyItemChanged(3)
        }
    }

    fun unSelectGiftItem(data: GiftResponse) {
        gifts.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = false
            it.quantity = 0
            notifyItemChanged(3)
        }
    }

    fun addAllProduct(mPromotion: PromotionResponse, mProduct: ArrayList<ProductResponse>) {
        promotions.indexOfFirst { it.id.toString().equals(mPromotion.id) }.let { index ->
            if (index != -1) {
                promotions.get(index).products.clear()
                promotions.get(index).products.addAll(mProduct)
                if (mProduct.size == 0) {
                    promotions.get(index).quantity = 0
                    promotions.get(index).isSelect = false
                }
                notifyItemChanged(2)
            }
        }
    }

    fun getSelectPromotions(): AddPromotionGiftRequest {
        var mGifts = gifts.filter { it.isSelect == true }.map {
            ProjectGiftRequest(
                quantity = it.selectQuantity,
                giftId = it.id.toString()
            )
        } as ArrayList<ProjectGiftRequest>
        var mPromotions = promotions.filter { it.isSelect == true }.map { mPromotionSelect ->
            AddPromotionRequest(promotionId = mPromotionSelect.id.toString(),
                products = mPromotionSelect.products.map { mProduct ->
                    ProjectProductRequest(
                        productId = mProduct.id.toString(),
                        price = mProduct.price,
                        quantity = mProduct.quantity
                    )
                } as ArrayList<ProjectProductRequest>,
                quantity = mPromotionSelect.quantity
            )
        } as ArrayList
        return AddPromotionGiftRequest(promotions = mPromotions, gifts = mGifts)
    }

    override fun getItemCount(): Int {
        return 4
    }


}