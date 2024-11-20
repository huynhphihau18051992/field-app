package studio.phillip.yolo.presentation.add.selectProject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.SimpleModel
import com.crayon.fieldapp.data.remote.response.PicProjectResponse

class SelectProjectRVAdapter constructor(
    val items: ArrayList<PicProjectResponse>,
    val context: Context,
    val itemClickListener: (PicProjectResponse) -> Unit = {}
) : RecyclerView.Adapter<SelectProjectRVAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_add_member_to_project, parent, false)
        val holder = EmployeeViewHolder(view)
        holder.adapterPosition
        return holder
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val data = items[position]
        holder.txtName.text = data.name
        holder.cbStore.isChecked = data.isSelect

        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .circleCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)


        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }

        holder.cbStore.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                holder.cbStore.isChecked = true
                items.get(position).isSelect = true
            } else {
                holder.cbStore.isChecked = false
                items.get(position).isSelect = false
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
        return this.items.size
    }

    fun removeUsers(uid: String) {
        items.indexOfFirst {
            it.id == uid
        }.let { index ->
            if (index != -1) {
                items.removeAt(index)
                notifyItemRemoved(index)
            }
        }
    }

    fun selectAllItems(isChecked: Boolean) {
        items.forEach {
            it.isSelect = isChecked
        }
        notifyDataSetChanged()
    }

    fun addUser(stores: List<PicProjectResponse>) {
        items.clear()
        items.addAll(stores)
        notifyDataSetChanged()
    }

    fun getUserIds(): List<String> {
        return items.map { it.id.toString() }
    }

    fun getSelectProject(): List<SimpleModel> {
        var listProjects = ArrayList<SimpleModel>()
        listProjects = items.filter { it.isSelect == true }
            .map {
                SimpleModel(
                    id = it.id.toString(),
                    name = it.name.toString()
                )
            } as ArrayList<SimpleModel>
        return listProjects
    }

    fun getSelectedItem(): List<String> {
        return items.filter { it.isSelect == true }.map { it.id.toString() }
    }
}