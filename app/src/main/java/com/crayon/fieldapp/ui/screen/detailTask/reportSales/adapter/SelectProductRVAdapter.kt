package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class SelectProductRVAdapter constructor(
    val items: ArrayList<ProductResponse>,
    val context: Context,
    val onPriceClick: (ProductResponse) -> Unit = {},
    val onItemSelectClick: (item: ProductResponse, isChecked: Boolean) -> Unit = { productResponse: ProductResponse, b: Boolean -> },
    val onItemAddClick: (item: ProductResponse) -> Unit = { },
    val onItemMinusClick: (item: ProductResponse) -> Unit = { }
) :
    RecyclerView.Adapter<SelectProductRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_product, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtProductName.text = data.name
        val format = DecimalFormat("#,###")
        format.maximumFractionDigits = 0
        holder.txtProductPrice.text = format.format(data.price) + "vnd"

        holder.txtNumber.text = data.quantity.toString()

        holder.cbProduct.isChecked = data.isSelect
        if (data.isSelect) {
            holder.imgPlus.isEnabled = true
            holder.imgMinus.isEnabled = true
            holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_select_add))
            holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_select_minus))
        } else {
            holder.imgPlus.isEnabled = false
            holder.imgMinus.isEnabled = false
            holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_gray_add))
            holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_minus))
        }
        holder.txtProductPrice?.setSingleClick {
            onPriceClick(data)
        }

        holder.cbProduct.setOnClickListener {
            val isChecked = holder.cbProduct.isChecked
            onItemSelectClick(data, isChecked)
        }
        holder.imgPlus.setSingleClick {
            onItemAddClick(data)
        }
        holder.imgMinus.setSingleClick {
            onItemMinusClick(data)
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cbProduct: CheckBox
        var txtProductName: TextView
        var txtProductPrice: TextView
        var imgPlus: ImageView
        var imgMinus: ImageView
        var txtNumber: TextView

        init {
            cbProduct = itemView.findViewById(R.id.cb_product)
            txtProductName = itemView.findViewById(R.id.txt_product_name)
            txtProductPrice = itemView.findViewById(R.id.txt_price)
            imgPlus = itemView.findViewById(R.id.img_plus)
            imgMinus = itemView.findViewById(R.id.img_minus)
            txtNumber = itemView.findViewById(R.id.txt_number)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun updatePrice(item: ProductResponse, price: Int) {
        items.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                items.get(index).price = price
                notifyItemChanged(index)
            }
        }
    }


    fun updateQuantity(item: ProductResponse, quantity: Int) {
        items.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                items.get(index).quantity = quantity
                notifyItemChanged(index)
            }
        }
    }


    fun selectItem(data: ProductResponse) {
        items.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = true
            notifyDataSetChanged()
        }
    }

    fun unSelectItem(data: ProductResponse) {
        items.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = false
            notifyDataSetChanged()
        }
    }

    fun getAllItemSelected(): ArrayList<ProductResponse> {
        return items.filter { it.isSelect == true } as ArrayList<ProductResponse>
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

}