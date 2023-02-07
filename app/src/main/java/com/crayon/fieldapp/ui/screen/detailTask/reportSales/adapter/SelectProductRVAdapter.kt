package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.utils.MStringUtils
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
    RecyclerView.Adapter<SelectProductRVAdapter.GroupViewHolder>(), Filterable {

    private val proudctList: ArrayList<ProductResponse>
    private var productListFiltered: ArrayList<ProductResponse>

    init {
        proudctList = items
        productListFiltered = items
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_product, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = productListFiltered[position]
        holder.txtProductName.text = data.name
        val format = DecimalFormat("#,###")
        format.maximumFractionDigits = 0
        holder.txtProductPrice.text = format.format(data.price) + "vnd"

        holder.txtNumber.text = data.quantity.toString()
        if (data.isEdit) {
            holder.icEdit.visibility = View.VISIBLE
        } else {
            holder.icEdit.visibility = View.GONE
        }

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
        var icEdit: ImageView

        init {
            cbProduct = itemView.findViewById(R.id.cb_product)
            txtProductName = itemView.findViewById(R.id.txt_product_name)
            txtProductPrice = itemView.findViewById(R.id.txt_price)
            imgPlus = itemView.findViewById(R.id.img_plus)
            imgMinus = itemView.findViewById(R.id.img_minus)
            txtNumber = itemView.findViewById(R.id.txt_number)
            icEdit = itemView.findViewById(R.id.img_edit)
        }
    }

    override fun getItemCount(): Int {
        return this.productListFiltered.size
    }

    fun updatePrice(item: ProductResponse, price: Int) {
        productListFiltered.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                productListFiltered.get(index).price = price
                productListFiltered.get(index).isEdit = true
                notifyItemChanged(index)
            }
        }
    }


    fun updateQuantity(item: ProductResponse, quantity: Int) {
        productListFiltered.indexOfFirst { it.id.toString().equals(item.id) }.let { index ->
            if (index != -1) {
                productListFiltered.get(index).quantity = quantity
                notifyItemChanged(index)
            }
        }
    }


    fun selectItem(data: ProductResponse) {
        productListFiltered.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = true
            it.quantity = 1
            notifyDataSetChanged()
        }
    }

    fun unSelectItem(data: ProductResponse) {
        productListFiltered.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = false
            it.quantity = 0
            notifyDataSetChanged()
        }
    }

    fun selectAll() {
        productListFiltered.forEach {
            it.isSelect = true
            if (it.quantity == 0) {
                it.quantity = 1
            }
        }
        notifyDataSetChanged()
    }

    fun unSelectAll() {
        productListFiltered.forEach {
            it.isSelect = false
            it.quantity = 0
        }
        notifyDataSetChanged()
    }

    fun getAllItemSelected(): ArrayList<ProductResponse> {
        return productListFiltered.filter { it.isSelect == true } as ArrayList<ProductResponse>
    }

    fun addAll(mProducts: ArrayList<ProductResponse>) {
        productListFiltered.clear()
        productListFiltered.addAll(mProducts)
        notifyDataSetChanged()
    }

    fun clearData() {
        productListFiltered.clear()
        notifyDataSetChanged()
    }

    fun refresh() {
        productListFiltered.clear()
        productListFiltered.addAll(items)
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val charString = MStringUtils.removeAccents(constraint.toString().toUpperCase())
                charString?.let {
                    productListFiltered = if (charString.isEmpty()) {
                        proudctList
                    } else {
                        val filteredList: ArrayList<ProductResponse> = ArrayList()
                        for (row in proudctList) {
                            val name = MStringUtils.removeAccents(row.name.toString().toUpperCase())
                            if (name.toString().contains(charString)) {
                                filteredList.add(row)
                            }
                        }
                        filteredList
                    }
                }
                val filterResults = FilterResults()
                filterResults.values = productListFiltered
                return filterResults
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                productListFiltered = results.values as ArrayList<ProductResponse>
                notifyDataSetChanged()
            }

        }
    }

}