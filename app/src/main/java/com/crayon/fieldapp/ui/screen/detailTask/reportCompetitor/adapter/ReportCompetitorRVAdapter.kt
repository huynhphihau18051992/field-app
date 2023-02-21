package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ReportOpponentResponse
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.formatHourAndDate
import com.crayon.fieldapp.utils.setSingleClick

class ReportCompetitorRVAdapter constructor(
    val items: ArrayList<ReportOpponentResponse>,
    val context: Context,
    val onItemClick: (ReportOpponentResponse) -> Unit = {},
    val onImageClick: (MediaData) -> Unit = {}
) :
    RecyclerView.Adapter<ReportCompetitorRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_competitor, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtCustomerId.text = "Hoạt động " + (position + 1)

        data.brandName?.let {
            holder.txtName.text = it.replace("\"", "")
        }

        data.type?.let {
            holder.txtType.text = it.replace("\"", "")
        }

        data.createdAt?.let {
            holder.txtDate.text = formatHourAndDate(it)
        }
        data.note?.let {
            holder.txtNote.text = it.replace("\"", "")
        }

        holder.cvImage1.visibility = View.GONE
        holder.cvImage2.visibility = View.GONE
        holder.cvImage3.visibility = View.GONE
        data.medias?.let {
            val options: RequestOptions = RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.ic_photo)
                .error(R.drawable.ic_photo)
                .override(300, 300)

            when (it.size) {
                1 -> {
                    GlideApp.with(context).load(it.get(0).thumbnailUrl).apply(options)
                        .into(holder.imgImage1)
                    holder.cvImage1.visibility = View.VISIBLE
                }
                2 -> {
                    GlideApp.with(context).load(it.get(0).thumbnailUrl).apply(options)
                        .into(holder.imgImage1)
                    GlideApp.with(context).load(it.get(1).thumbnailUrl).apply(options)
                        .into(holder.imgImage2)
                    holder.cvImage1.visibility = View.VISIBLE
                    holder.cvImage2.visibility = View.VISIBLE
                }
                3 -> {
                    GlideApp.with(context).load(it.get(0).thumbnailUrl).apply(options)
                        .into(holder.imgImage1)
                    GlideApp.with(context).load(it.get(1).thumbnailUrl).apply(options)
                        .into(holder.imgImage2)
                    GlideApp.with(context).load(it.get(2).thumbnailUrl).apply(options)
                        .into(holder.imgImage3)
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

        holder.itemView.setSingleClick {
            onItemClick(data)
        }

        holder.cvImage1?.setSingleClick {
            data?.medias?.get(0)?.let {
                onImageClick(
                    MediaData(
                        id = it.id.toString(),
                        thumbnail = it.thumbnailUrl.toString(),
                        uri = it.fileUrl.toString(),
                        isCompleted = false,
                        type = if (it.type.toString()
                                .equals("image/jpeg")
                        ) MediaAdapter.MEDIA_IMAGE else MediaAdapter.MEDIA_VIDEO
                    )
                )
            }
        }

        holder.cvImage2?.setSingleClick {
            data?.medias?.get(1)?.let {
                onImageClick(
                    MediaData(
                        id = it.id.toString(),
                        thumbnail = it.thumbnailUrl.toString(),
                        uri = it.fileUrl.toString(),
                        isCompleted = false,
                        type = if (it.type.toString()
                                .equals("image/jpeg")
                        ) MediaAdapter.MEDIA_IMAGE else MediaAdapter.MEDIA_VIDEO
                    )
                )
            }
        }

        holder.cvImage3?.setSingleClick {
            data?.medias?.get(2)?.let {
                onImageClick(
                    MediaData(
                        id = it.id.toString(),
                        thumbnail = it.thumbnailUrl.toString(),
                        uri = it.fileUrl.toString(),
                        isCompleted = false,
                        type = if (it.type.toString()
                                .equals("image/jpeg")
                        ) MediaAdapter.MEDIA_IMAGE else MediaAdapter.MEDIA_VIDEO
                    )
                )
            }
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var txtName: TextView
        var txtType: TextView
        var txtDate: TextView
        var txtNote: TextView
        var cvImage1: CardView
        var cvImage2: CardView
        var cvImage3: CardView
        var imgImage1: ImageView
        var imgImage2: ImageView
        var imgImage3: ImageView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_customer_num)
            txtName = itemView.findViewById(R.id.txt_name)
            txtType = itemView.findViewById(R.id.txt_type)
            txtDate = itemView.findViewById(R.id.txt_date)
            txtNote = itemView.findViewById(R.id.txt_note)
            imgImage1 = itemView.findViewById(R.id.img_1)
            imgImage2 = itemView.findViewById(R.id.img_2)
            imgImage3 = itemView.findViewById(R.id.img_3)

            cvImage1 = itemView.findViewById(R.id.cv_image1)
            cvImage2 = itemView.findViewById(R.id.cv_image2)
            cvImage3 = itemView.findViewById(R.id.cv_image3)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addItems(list: ArrayList<ReportOpponentResponse>) {
        list.sortByDescending { it.createdAt }
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

}