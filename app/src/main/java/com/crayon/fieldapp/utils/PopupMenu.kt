package com.crayon.fieldapp.utils

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.MenuCallback

class PopupMenu {
    companion object {

        fun showPopupMenuDashboard(view: View, callback: MenuCallback) {
            val inflater =
                view.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.popup_menu_dashboard, null)
            val width = LinearLayout.LayoutParams.WRAP_CONTENT
            val height = LinearLayout.LayoutParams.WRAP_CONTENT


            PopupWindow(popupView, width, height, true).apply {
                isOutsideTouchable = true
                animationStyle = R.style.AnimationStartPopup
                showAtLocation(view, Gravity.NO_GRAVITY, 0, 0)

                val btnImport: TextView = popupView.findViewById(R.id.btnImport)
                val btnExport: TextView = popupView.findViewById(R.id.btnExport)
                val clRoot: LinearLayout = popupView.findViewById(R.id.clRoot)

                clRoot.setOnClickListener {
                    dismiss()
                }

                btnImport.apply {
                    setOnClickListener {
                        callback.onImport()
                        dismiss()
                    }
                }

                btnExport.apply {
                    setOnClickListener {
                        callback.onExport()
                        dismiss()
                    }
                }

            }
        }

    }
}