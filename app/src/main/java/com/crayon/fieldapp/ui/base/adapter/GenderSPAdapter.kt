package com.crayon.fieldapp.ui.base.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Gender

class GenderSPAdapter constructor(
    val items: Array<Gender>,
    private val context: Context
) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null) {
            view = View.inflate(context, R.layout.item_simple_spinner, null)
        }
        return view!!.apply {
            val names = findViewById<TextView>(R.id.txt_name)
            items[position].let {
                names.text = it.text
            }
        }
    }

    override fun getItem(position: Int): Gender {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}