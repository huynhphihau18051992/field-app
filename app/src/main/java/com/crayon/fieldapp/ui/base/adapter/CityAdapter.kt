package com.crayon.fieldapp.ui.base.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.CityModel
import com.crayon.fieldapp.data.model.SimpleModel

class CityAdapter(val context: Context, var items: ArrayList<SimpleModel>) : BaseAdapter() {
    val mInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: ItemRowHolder
        if (convertView == null) {
            view = mInflater.inflate(R.layout.item_city, parent, false)
            vh = ItemRowHolder(view)
            view?.tag = vh
        } else {
            view = convertView
            vh = view.tag as ItemRowHolder
        }

        vh.label.text = items.get(position).name
        return view
    }

    override fun getItem(position: Int): SimpleModel {
        return items.get(position)

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

    private class ItemRowHolder(row: View?) {

        val label: TextView

        init {
            this.label = row?.findViewById(R.id.txt_name) as TextView
        }
    }

    fun setData(mItems: ArrayList<SimpleModel>) {
        items.clear()
        items.addAll(mItems)
        notifyDataSetChanged()
    }

    fun getPositionByCode(code: String): Int {
        return items.indexOfFirst { it.id.equals(code) }
    }
}