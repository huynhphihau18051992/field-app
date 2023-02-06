package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter
import kotlinx.android.synthetic.main.item_gift_info.view.*
import kotlinx.android.synthetic.main.item_promotion_info.view.*

class SelectPromotionRVAdapter constructor(
    val promotion: ArrayList<PromotionResponse>,
    val gifts: ArrayList<GiftResponse>,
    val context: Context,
    val onShowSelectProduct: (promotion: PromotionResponse) -> Unit = {},
    val onItemClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var mPromotionRVAdapter: PromotionRVAdapter
    private lateinit var mGiftRVAdapter: GiftRVAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
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
        if (holder is PromotionItemViewHolder) {
            mPromotionRVAdapter = PromotionRVAdapter(
                items = promotion,
                context = context,
                onCheckBoxSelect = { mPromotion, isChecked ->
                    if (isChecked) {
                        mPromotionRVAdapter.onSelectItem(mPromotion)
                        onShowSelectProduct(mPromotion)
                    } else {
                        mPromotionRVAdapter.onUnSelectItem(mPromotion)
                    }

                }, onItemDeleteListener = { mPromotion ->
                    mPromotionRVAdapter.onDeleteAllProduct(promotion = mPromotion)

                }, onItemPlusListener = { mPromotion ->
                    var quantity = mPromotion.quantity + 1
                    mPromotionRVAdapter.onUpdateQuantity(mPromotion, quantity)
                }, onItemMinusListener = { mPromotion ->
                    var quantity = mPromotion.quantity - 1
                    if (quantity <= 0) {
                        quantity = 1
                    }
                    mPromotionRVAdapter.onUpdateQuantity(mPromotion, quantity)
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
            0 -> R.layout.item_promotion_info
            else -> R.layout.item_gift_info
        }
    }


    inner class PromotionItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvPromotion: RecyclerView = view.rv_promotion
    }

    inner class GiftItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvGift: RecyclerView = view.rv_gift
    }

    fun addItems(mPromotion: ArrayList<PromotionResponse>, mGift: ArrayList<GiftResponse>) {
        promotion.clear()
        gifts.clear()
        promotion.addAll(mPromotion)
        gifts.addAll(mGift)
        notifyDataSetChanged()
    }

    fun addAllProduct(mPromotion: PromotionResponse, mProduct: ArrayList<ProductResponse>) {
        promotion.indexOfFirst { it.id.toString().equals(mPromotion.id) }.let { index ->
            if (index != -1) {
                promotion.get(index).products.clear()
                promotion.get(index).products.addAll(mProduct)
                notifyItemChanged(0)
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
        var mPromotions = promotion.filter { it.isSelect == true }.map {
            AddPromotionRequest(promotionId = it.id.toString(),
                products = it.products.map {
                    ProjectProductRequest(
                        productId = it.id.toString(),
                        price = it.price,
                        quantity = it.quantity
                    )
                } as ArrayList<ProjectProductRequest>
            )
        } as ArrayList

        return AddPromotionGiftRequest(promotions = mPromotions, gifts = mGifts)
    }

    override fun getItemCount(): Int {
        return 2
    }
}