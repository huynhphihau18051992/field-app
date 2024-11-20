package com.crayon.fieldapp.ui.widgets

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R

class GridDividerItemDecoration(context: Context, divider: Int) : RecyclerView.ItemDecoration() {

    private val mDivider: Drawable
    private val mInsets: Int

    init {
        val a = context.obtainStyledAttributes(ATTRS)
        mDivider = context.resources.getDrawable(divider, null)
        a.recycle()

        mInsets = context.resources.getDimensionPixelSize(R.dimen.card_insets)
    }

    override fun onDrawOver(c: Canvas, parent: androidx.recyclerview.widget.RecyclerView, state: androidx.recyclerview.widget.RecyclerView.State) {
        drawVertical(c, parent)
        drawHorizontal(c, parent)
    }

    private fun drawVertical(c: Canvas, parent: androidx.recyclerview.widget.RecyclerView) {
        if (parent.childCount == 0) return

        val childCount = parent.childCount

        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)
            val params = child.layoutParams as androidx.recyclerview.widget.RecyclerView.LayoutParams

            val left = child.left - params.leftMargin - mInsets
            val right = child.right + params.rightMargin + mInsets
            val top = child.bottom + params.bottomMargin + mInsets
            val bottom = top + mDivider.intrinsicHeight
//            if (i != childCount - 1) {
            mDivider.setBounds(left, top, right, bottom)
//            }
            mDivider.draw(c)
        }
    }

    private fun drawHorizontal(c: Canvas, parent: androidx.recyclerview.widget.RecyclerView) {
        val childCount = parent.childCount

        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)
            val params = child.layoutParams as androidx.recyclerview.widget.RecyclerView.LayoutParams

            val left = child.right + params.rightMargin + mInsets
            val right = left + mDivider.intrinsicWidth
            val top = child.top - params.topMargin - mInsets
            val bottom = child.bottom + params.bottomMargin + mInsets
//            if (i % 2 == 0) {
            mDivider.setBounds(left, top, right, bottom)
//            }
            mDivider.draw(c)
        }
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: androidx.recyclerview.widget.RecyclerView, state: androidx.recyclerview.widget.RecyclerView.State) {
        outRect.set(mInsets, mInsets, mInsets, mInsets)
    }

    companion object {
        private val ATTRS = intArrayOf(android.R.attr.listDivider)
    }
}