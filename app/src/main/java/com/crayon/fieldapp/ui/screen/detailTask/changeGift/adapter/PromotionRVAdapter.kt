package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class PromotionRVAdapter constructor(
    val items: ArrayList<PromotionResponse>,
    val context: Context,
    val onCheckBoxSelect: (promotion: PromotionResponse, isChecked: Boolean) -> Unit = { i: PromotionResponse, b: Boolean -> },
    val onItemPlusListener: (promotion: PromotionResponse) -> Unit = { },
    val onItemMinusListener: (promotion: PromotionResponse) -> Unit = { },
    val onItemDeleteListener: (promotion: PromotionResponse) -> Unit = {},
    val onItemEditListener: (promotion: PromotionResponse) -> Unit = {},
    val onItemQuantityListener: (promotion: PromotionResponse) -> Unit = {},
    val isEdit: Boolean = true
) :
    RecyclerView.Adapter<PromotionRVAdapter.GroupViewHolder>() {
    private lateinit var mPromotionAdapter: SubProductRVAdapter


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_promotion, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]

        if (data.products.size == 0) {
            holder.llTotal.visibility = View.GONE
        } else {
            holder.llTotal.visibility = View.VISIBLE
        }
        val totalPrice = data.products.sumBy { it.price * it.quantity }
        val format = DecimalFormat("#,###")
        format.maximumFractionDigits = 0
        holder.txtTotal.text = format.format(totalPrice) + "vnd"

        holder.cbProduct.text = data.name
        holder.cbProduct.isChecked = data.isSelect
        holder.txtNumber.text = data.quantity.toString()
        if (data.isSelect) {
            if (isEdit) {
                holder.imgPlus.isEnabled = true
                holder.imgMinus.isEnabled = true
                holder.txtNumber.isEnabled = true
                holder.cbProduct.isEnabled = true
                holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_select_add))
                holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_select_minus))
            } else {
                holder.imgPlus.isEnabled = false
                holder.imgMinus.isEnabled = false
                holder.txtNumber.isEnabled = false
                holder.cbProduct.isEnabled = false
                holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_gray_add))
                holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_minus))
            }
        } else {
            if (isEdit) {
                holder.cbProduct.isEnabled = true
            } else {
                holder.cbProduct.isEnabled = false
            }
            holder.imgPlus.isEnabled = false
            holder.imgMinus.isEnabled = false
            holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_gray_add))
            holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_minus))
        }

        if (items.size - 1 == position) {
            holder.imgLine.visibility = View.GONE
        } else {
            holder.imgLine.visibility = View.VISIBLE
        }

        holder.cbProduct?.setOnClickListener {
            val isChecked = holder.cbProduct.isChecked
            onCheckBoxSelect(data, isChecked)
        }

        mPromotionAdapter = SubProductRVAdapter(data.products, context, {
        }, {

        })
        if (isEdit) {
            holder.btnDelete.visibility = View.VISIBLE
            holder.btnEdit.visibility = View.VISIBLE
        } else {
            holder.btnDelete.visibility = View.GONE
            holder.btnEdit.visibility = View.GONE
        }
        holder.btnEdit?.setSingleClick {
            onItemEditListener(data)
        }

        holder.btnDelete?.setSingleClick {
            onItemDeleteListener(data)
        }

        holder.rvProduct.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mPromotionAdapter
        }

        holder.imgMinus?.setSingleClick {
            onItemMinusListener(data)
        }

        holder.imgPlus?.setSingleClick {
            onItemPlusListener(data)
        }

        holder.txtNumber?.setSingleClick {
            onItemQuantityListener(data)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rvProduct: RecyclerView
        var imgLine: ImageView
        var cbProduct: CheckBox
        var llTotal: LinearLayout
        var txtTotal: TextView
        var btnDelete: RelativeLayout
        var btnEdit: RelativeLayout
        var imgPlus: ImageView
        var imgMinus: ImageView
        var txtNumber: TextView

        init {
            rvProduct = itemView.findViewById(R.id.rv_product)
            imgLine = itemView.findViewById(R.id.img_line)
            cbProduct = itemView.findViewById(R.id.cb_product)
            llTotal = itemView.findViewById(R.id.ll_total)
            txtTotal = itemView.findViewById(R.id.txt_total_price)
            cbProduct = itemView.findViewById(R.id.cb_product)
            btnDelete = itemView.findViewById(R.id.btn_delete)
            btnEdit = itemView.findViewById(R.id.btn_edit)
            imgPlus = itemView.findViewById(R.id.img_plus)
            imgMinus = itemView.findViewById(R.id.img_minus)
            txtNumber = itemView.findViewById(R.id.txt_number)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }


    fun addAll(promotion: PromotionResponse, proudcts: ArrayList<ProductResponse>) {
        items.indexOfFirst { it.id.toString().equals(promotion.id) }.let { index ->
            if (index != -1) {
                items.get(index).products.clear()
                items.get(index).products.addAll(proudcts)
                notifyItemChanged(index)
            }
        }
    }

    fun onDeleteAllProduct(promotion: PromotionResponse) {
        items.indexOfFirst { it.id.toString().equals(promotion.id) }.let { index ->
            if (index != -1) {
                items.get(index).products.clear()
                notifyItemChanged(index)
            }
        }
    }

    fun onSelectItem(promotion: PromotionResponse) {
        items.indexOfFirst { it.id.toString().equals(promotion.id) }.let { index ->
            if (index != -1) {
                items.get(index).isSelect = true
                items.get(index).quantity = 1
                notifyItemChanged(index)
            }
        }
    }

    fun onUnSelectItem(promotion: PromotionResponse) {
        items.indexOfFirst { it.id.toString().equals(promotion.id) }.let { index ->
            if (index != -1) {
                items.get(index).isSelect = false
                items.get(index).quantity = 0
                notifyItemChanged(index)
            }
        }
    }

    fun onUpdateQuantity(promotion: PromotionResponse, quantity: Int) {
        items.indexOfFirst { it.id.toString().equals(promotion.id) }.let { index ->
            if (index != -1) {
                items.get(index).quantity = quantity
                notifyItemChanged(index)
            }
        }
    }

}