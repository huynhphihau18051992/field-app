package com.crayon.fieldapp.ui.screen.detailAttachment.product.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse

class ProductAdapter constructor(
    val items: ArrayList<Any>,
    val context: Context
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        if (viewType == PROUDCT_TYPE) {
            val view = inflater.inflate(R.layout.item_report_product, parent, false)
            val holder = ProudctViewHolder(view)
            return holder
        } else {
            val view = inflater.inflate(R.layout.item_report_feedback, parent, false)
            val holder = FeedbackViewHolder(view)
            return holder
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (items.get(position) is TaskResponse.Product) {
            return PROUDCT_TYPE
        } else {
            return FEEDBACK_TYPE
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == PROUDCT_TYPE) {
            val data = items[position] as TaskResponse.Product
            data.name?.let {
                (holder as ProudctViewHolder).tv_product_name.text = it
            }

            data.quantity?.let {
                (holder as ProudctViewHolder).tv_quality.text = it.toString()
            }
        } else {
            val data = items[position] as TaskResponse.Feedback
            data.name?.let {
                (holder as FeedbackViewHolder).tv_feedback_name.text = it
            }
            data.description?.let {
                (holder as FeedbackViewHolder).tv_feedback.text = it
            }

        }
    }

    inner class ProudctViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_product_name: TextView
        var tv_quality: TextView

        init {
            tv_product_name = itemView.findViewById(R.id.tv_product_name)
            tv_quality = itemView.findViewById(R.id.tv_quality)
        }
    }

    inner class FeedbackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_feedback_name: TextView
        var tv_feedback: TextView

        init {
            tv_feedback_name = itemView.findViewById(R.id.tv_feedback_name)
            tv_feedback = itemView.findViewById(R.id.tv_feedback)
        }
    }


    fun addProducts(mItems: ArrayList<Any>) {
        items.clear()
        items.addAll(mItems)
        notifyDataSetChanged()
    }

    fun getProducts(): List<Any> {
        return items.filter { it is TaskResponse.Product }
    }

    fun getFeedbacks(): List<Any> {
        return items.filter { it is TaskResponse.Feedback }
    }

    fun getAllData(): List<Any> {
        return items
    }

    fun getItem(position: Int): Any {
        return items.get(position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    companion object {
        val PROUDCT_TYPE = 0
        val FEEDBACK_TYPE = 1
    }

}

