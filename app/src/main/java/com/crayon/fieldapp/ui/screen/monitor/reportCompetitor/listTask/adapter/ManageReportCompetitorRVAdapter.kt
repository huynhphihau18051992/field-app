package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.listTask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.formatHourAndDate

class ManageReportCompetitorRVAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageReportCompetitorRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_competitor, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        data.store?.let {
            holder.txtStore.text = it.name.toString()
        }

        data.opponents?.let {
            it.lastOrNull()?.let { opponents ->
                opponents.brandName?.let {
                    holder.txtName.text = it
                }
                opponents.type?.let {
                    holder.txtType.text = it
                }
                opponents.createdAt?.let {
                    holder.txtDate.text = formatHourAndDate(it)
                }
                opponents.medias?.let { media ->
                    val options: RequestOptions = RequestOptions()
                        .centerCrop()
                        .placeholder(R.drawable.ic_photo)
                        .error(R.drawable.ic_photo)
                        .override(300, 300)
                    holder.cvImage1.visibility = View.GONE
                    holder.cvImage2.visibility = View.GONE
                    holder.cvImage3.visibility = View.GONE
                    when (media.size) {
                        1 -> {
                            GlideApp.with(context).load(media.get(0)).apply(options)
                                .into(holder.cvImage1)
                            holder.cvImage1.visibility = View.VISIBLE
                        }
                        2 -> {
                            GlideApp.with(context).load(media.get(0).thumbnailUrl).apply(options)
                                .into(holder.cvImage1)
                            GlideApp.with(context).load(media.get(1).thumbnailUrl).apply(options)
                                .into(holder.cvImage2)
                            holder.cvImage1.visibility = View.VISIBLE
                            holder.cvImage2.visibility = View.VISIBLE
                        }
                        3 -> {
                            GlideApp.with(context).load(media.get(0).thumbnailUrl).apply(options)
                                .into(holder.cvImage1)
                            GlideApp.with(context).load(media.get(1).thumbnailUrl).apply(options)
                                .into(holder.cvImage2)
                            GlideApp.with(context).load(media.get(3).thumbnailUrl).apply(options)
                                .into(holder.cvImage3)
                            holder.cvImage1.visibility = View.VISIBLE
                            holder.cvImage2.visibility = View.VISIBLE
                            holder.cvImage3.visibility = View.VISIBLE
                        }
                        else -> {
                            holder.cvImage1.visibility = View.GONE
                            holder.cvImage2.visibility = View.GONE
                            holder.cvImage3.visibility = View.GONE
                        }
                    }
                }
            }
        }

    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtName: TextView
        var txtType: TextView
        var txtDate: TextView
        var txtGift: TextView
        var cvImage1: ImageView
        var cvImage2: ImageView
        var cvImage3: ImageView

        init {
            txtStore = itemView.findViewById(R.id.txt_customer_num)
            txtName = itemView.findViewById(R.id.txt_name)
            txtType = itemView.findViewById(R.id.txt_type)
            txtDate = itemView.findViewById(R.id.txt_date)
            txtGift = itemView.findViewById(R.id.txt_note)
            cvImage1 = itemView.findViewById(R.id.img_1)
            cvImage2 = itemView.findViewById(R.id.img_2)
            cvImage3 = itemView.findViewById(R.id.img_3)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }


    fun addAll(jobs: List<TaskResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}