package com.crayon.fieldapp.ui.screen.detailTask.changeGift.export.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.utils.MStringUtils
import com.crayon.fieldapp.utils.setSingleClick

class ExportGiftAdapter constructor(
    val items: ArrayList<GiftResponse>,
    val context: Context,
    val onItemListener: (gift: GiftResponse) -> Unit = { }
) :
    RecyclerView.Adapter<ExportGiftAdapter.GroupViewHolder>(), Filterable {
    private val contactList: ArrayList<GiftResponse>
    private var contactListFiltered: ArrayList<GiftResponse>

    init {
        contactList = items
        contactListFiltered = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_export_gift_title, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = contactListFiltered[position]
        holder.tvGift.text = data.name

        holder.txtImport.text = data.quantityIn.toString()
        holder.txtConsume.text = data.quantityConsume.toString()
        holder.txtRemainPlan.text = (data.quantityIn - data.quantityConsume).toString()
        holder.txtRemainActual.text = data.quantityRemainActual.toString()

        holder.itemView?.setSingleClick {
            onItemListener(data)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvGift: TextView
        var txtRemainPlan: TextView
        var txtRemainActual: TextView
        var txtConsume: TextView
        var txtImport: TextView

        init {
            tvGift = itemView.findViewById(R.id.txtGift)
            txtRemainPlan = itemView.findViewById(R.id.txt_remain_plan)
            txtRemainActual = itemView.findViewById(R.id.txt_remain_actual)
            txtConsume = itemView.findViewById(R.id.txt_consume)
            txtImport = itemView.findViewById(R.id.txt_import)
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
                contactListFiltered.get(index).quantityRemainActual = quantity
                notifyItemChanged(index)
            }
        }
    }

    fun addAll(mGift: ArrayList<GiftResponse>) {
        contactListFiltered.clear()
        contactListFiltered.addAll(mGift)
        notifyDataSetChanged()
    }

    fun refresh() {
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