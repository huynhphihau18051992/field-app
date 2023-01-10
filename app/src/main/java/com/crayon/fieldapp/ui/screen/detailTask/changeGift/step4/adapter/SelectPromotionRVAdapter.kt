package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct.SelectProductBottomSheetFragment
import kotlinx.android.synthetic.main.item_gift_info.view.*
import kotlinx.android.synthetic.main.item_promotion_info.view.*

class SelectPromotionRVAdapter constructor(
    val products: ArrayList<String>,
    val gifts: ArrayList<String>,
    val context: Context,
    val onShowSelectProduct: (String) -> Unit = {},
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
            mPromotionRVAdapter =
                PromotionRVAdapter(products, context, { i: Int, isChecked: Boolean ->
                    if (isChecked) {
                        onShowSelectProduct("")
                    }
                }, {

                })
            holder.rvPromotion.apply {
                layoutManager = LinearLayoutManager(context)
                this.adapter = mPromotionRVAdapter
            }
        } else {
            mGiftRVAdapter = GiftRVAdapter(gifts, context, {

            }, {

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


    override fun getItemCount(): Int {
        return 2
    }
}