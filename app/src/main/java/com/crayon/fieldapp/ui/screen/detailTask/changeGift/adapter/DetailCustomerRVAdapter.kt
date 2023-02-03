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
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import kotlinx.android.synthetic.main.item_bill_info.view.*
import kotlinx.android.synthetic.main.item_customer_info.view.*
import kotlinx.android.synthetic.main.item_gift_info.view.*
import kotlinx.android.synthetic.main.item_promotion_info.view.*

class DetailCustomerRVAdapter constructor(
    val images: ArrayList<String>,
    val promotions: ArrayList<PromotionResponse>,
    val gifts: ArrayList<GiftResponse>,
    val context: Context,
    val isEidt: Boolean,
    val onEditItemClick: (String) -> Unit = {},
    val onItemClick: (String) -> Unit = {}
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

        } else if (holder is BillItemViewHolder) {

            mImageAdapter = BillImageRVAdapter(images, context)
            holder.rvImages.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                this.adapter = mImageAdapter
            }
        } else if (holder is PromotionItemViewHolder) {
            mPromotionRVAdapter = PromotionRVAdapter(
                items = promotions,
                context = context,
                onCheckBoxSelect = { position, isChecked ->

                }, onItemDeleteListener = {

                })
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
                    })
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


    override fun getItemCount(): Int {
        return 4
    }


}