package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.utils.setSingleClick

class GiftRVAdapter constructor(
    val items: ArrayList<GiftResponse>,
    val context: Context,
    val onItemSelectedListener: (gift: GiftResponse, isChecked: Boolean) -> Unit = { i: GiftResponse, b: Boolean -> },
    val onItemPlusListener: (gift: GiftResponse) -> Unit = { },
    val onItemMinusListener: (gift: GiftResponse) -> Unit = { },
    val onItemQuantityListener: (gift: GiftResponse) -> Unit = {},
    val isEdit: Boolean = true
) :
    RecyclerView.Adapter<GiftRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_gift, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.cvGift.text = data.name

        holder.cvGift.isChecked = data.isSelect
        holder.edtNumber.setText(data.selectQuantity.toString())
        holder.edtNumber.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                p0?.let { mQuantity ->
                    mQuantity.toString().toIntOrNull()?.let {
                        data.selectQuantity = it
                    }
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        if (data.isSelect) {
            if (isEdit) {
                holder.imgPlus.isEnabled = true
                holder.imgMinus.isEnabled = true
                holder.edtNumber.isEnabled = true
                holder.cvGift.isEnabled = true
                holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_select_add))
                holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_select_minus))
            } else {
                holder.imgPlus.isEnabled = false
                holder.imgMinus.isEnabled = false
                holder.edtNumber.isEnabled = false
                holder.cvGift.isEnabled = false
                holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_gray_add))
                holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_minus))
            }
        } else {
            if (isEdit) {
                holder.cvGift.isEnabled = true
            } else {
                holder.cvGift.isEnabled = false
            }
            holder.imgPlus.isEnabled = false
            holder.imgMinus.isEnabled = false
            holder.edtNumber.isEnabled = false
            holder.imgPlus.setImageDrawable(context.getDrawable(R.drawable.ic_gray_add))
            holder.imgMinus.setImageDrawable(context.getDrawable(R.drawable.ic_minus))
        }

        holder.cvGift?.setOnClickListener {
            val isChecked = holder.cvGift.isChecked
            onItemSelectedListener(data, isChecked)
        }

        holder.imgMinus?.setSingleClick {
            onItemMinusListener(data)
        }

        holder.imgPlus?.setSingleClick {
            onItemPlusListener(data)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cvGift: CheckBox
        var edtNumber: EditText
        var imgPlus: ImageView
        var imgMinus: ImageView

        init {
            cvGift = itemView.findViewById(R.id.cb_product)
            imgMinus = itemView.findViewById(R.id.img_minus)
            edtNumber = itemView.findViewById(R.id.txt_number)
            imgPlus = itemView.findViewById(R.id.img_plus)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun onSelectItem(gift: GiftResponse) {
        items.indexOfFirst { it.id.toString().equals(gift.id) }.let { index ->
            if (index != -1) {
                items.get(index).isSelect = true
                items.get(index).selectQuantity = 1
                notifyItemChanged(index)
            }
        }
    }

    fun onUnSelectItem(gift: GiftResponse) {
        items.indexOfFirst { it.id.toString().equals(gift.id) }.let { index ->
            if (index != -1) {
                items.get(index).isSelect = false
                items.get(index).selectQuantity = 0
                notifyItemChanged(index)
            }
        }
    }

    fun onUpdateQuantity(gift: GiftResponse, quantity: Int) {
        items.indexOfFirst { it.id.toString().equals(gift.id) }.let { index ->
            if (index != -1) {
                items.get(index).selectQuantity = quantity
                notifyItemChanged(index)
            }
        }
    }

}