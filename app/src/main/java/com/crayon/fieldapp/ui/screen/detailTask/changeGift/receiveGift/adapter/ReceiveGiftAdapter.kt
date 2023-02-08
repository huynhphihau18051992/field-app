package com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.utils.MStringUtils
import com.crayon.fieldapp.utils.setSingleClick

class ReceiveGiftAdapter constructor(
    val items: ArrayList<GiftResponse>,
    val context: Context,
    val onItemPlusListener: (gift: GiftResponse) -> Unit = { },
    val onItemMinusListener: (gift: GiftResponse) -> Unit = { }
) :
    RecyclerView.Adapter<ReceiveGiftAdapter.GroupViewHolder>(), Filterable {
    private val contactList: ArrayList<GiftResponse>
    private var contactListFiltered: ArrayList<GiftResponse>

    init {
        contactList = items
        contactListFiltered = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_receive_gift, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = contactListFiltered[position]
        holder.tvGift.text = data.name

        holder.txtNumber.text = data.selectQuantity.toString()
        holder.imgPlus.isEnabled = true
        holder.imgMinus.isEnabled = true
        holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_select_add))
        holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_select_minus))


        holder.imgMinus?.setSingleClick {
            onItemMinusListener(data)
        }

        holder.imgPlus?.setSingleClick {
            onItemPlusListener(data)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvGift: TextView
        var txtNumber: TextView
        var imgPlus: ImageView
        var imgMinus: ImageView

        init {
            tvGift = itemView.findViewById(R.id.txtGift)
            imgMinus = itemView.findViewById(R.id.img_minus)
            txtNumber = itemView.findViewById(R.id.txt_number)
            imgPlus = itemView.findViewById(R.id.img_plus)
        }
    }

    override fun getItemCount(): Int {
        return this.contactListFiltered.size
    }

    fun clearData() {
        contactListFiltered.clear()
        notifyDataSetChanged()
    }

    fun onUpdateQuantity(gift: GiftResponse, quantity: Int) {
        contactListFiltered.indexOfFirst { it.id.toString().equals(gift.id) }.let { index ->
            if (index != -1) {
                contactListFiltered.get(index).selectQuantity = quantity
                notifyItemChanged(index)
            }
        }
    }

    fun addAll(mGift: ArrayList<GiftResponse>) {
        contactListFiltered.clear()
        contactListFiltered.addAll(mGift)
        notifyDataSetChanged()
    }

    fun refresh(){
        contactListFiltered.clear()
        contactListFiltered.addAll(items)
        notifyDataSetChanged()
    }


    fun getSelectItems(): ArrayList<GiftResponse> {
        return contactListFiltered
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val charString = MStringUtils.removeAccents(constraint.toString().toUpperCase())
                charString?.let {
                    contactListFiltered = if (charString.isEmpty()) {
                        contactList
                    } else {
                        val filteredList: ArrayList<GiftResponse> = ArrayList()
                        for (row in contactList) {
                            val name = MStringUtils.removeAccents(row.name.toString().toUpperCase())
                            if (name.toString().contains(charString)) {
                                filteredList.add(row)
                            }
                        }
                        filteredList
                    }
                }
                val filterResults = FilterResults()
                filterResults.values = contactListFiltered
                return filterResults
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                contactListFiltered = results.values as ArrayList<GiftResponse>
                notifyDataSetChanged()
            }

        }
    }

}