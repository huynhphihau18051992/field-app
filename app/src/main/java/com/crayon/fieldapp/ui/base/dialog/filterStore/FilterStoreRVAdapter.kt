package studio.phillip.yolo.presentation.add.selectProject.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore
import com.crayon.fieldapp.utils.MStringUtils
import java.util.stream.Collectors

class FilterStoreRVAdapter constructor(
    val contacts: ArrayList<ItemStore>,
    val context: Context,
    val itemClickListener: (ItemStore) -> Unit = {}
) : RecyclerView.Adapter<FilterStoreRVAdapter.EmployeeViewHolder>(), Filterable {
    private val contactList: ArrayList<ItemStore>
    private var contactListFiltered: ArrayList<ItemStore>

    init {
        contactList = contacts
        contactListFiltered = contacts
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_filter_store, parent, false)
        val holder = EmployeeViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val data = contactListFiltered[position]
        holder.txtName.text = data.name
        holder.cbStore.isChecked = data.isSelect

        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }

        holder.cbStore.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                holder.cbStore.isChecked = true
                contactListFiltered.get(position).isSelect = true
            } else {
                holder.cbStore.isChecked = false
                contactListFiltered.get(position).isSelect = false
            }
        }
    }

    inner class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var cbStore: CheckBox

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            cbStore = itemView.findViewById(R.id.cb_user)
        }
    }


    override fun getItemCount(): Int {
        return this.contactListFiltered.size
    }

    fun selectAll() {
        contactListFiltered.forEach {
            it.isSelect = true
        }
        notifyDataSetChanged()
    }

    fun selectItem(data: ItemStore) {
        contactListFiltered.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = true
            notifyDataSetChanged()
        }
    }

    fun unSelectItem(data: ItemStore) {
        contactListFiltered.findLast { it.id.equals(data.id) }?.let {
            it.isSelect = false
            notifyDataSetChanged()
        }
    }

    fun addAll(list: ArrayList<ItemStore>) {
        contactListFiltered.clear()
        contactListFiltered.addAll(list)
        notifyDataSetChanged()
    }

    fun clearAll() {
        contactListFiltered.forEach {
            it.isSelect = false
        }
        notifyDataSetChanged()
    }


    fun getSelectedItem(): List<String> {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            contactListFiltered.filter { it.isSelect == true }.map { it.id.toString() }.stream()
                .distinct()
                .collect(
                    Collectors.toList()
                )
        } else {
            contactListFiltered.filter { it.isSelect == true }.map { it.id.toString() }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val charString = MStringUtils.removeAccents(constraint.toString().toUpperCase())
                charString?.let {
                    contactListFiltered = if (charString.isEmpty()) {
                        contactList
                    } else {
                        val filteredList: ArrayList<ItemStore> = ArrayList()
                        for (row in contactList) {
                            val name = MStringUtils.removeAccents(row.name.toUpperCase())
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
                contactListFiltered = results.values as ArrayList<ItemStore>
                notifyDataSetChanged()
            }

        }
    }
}