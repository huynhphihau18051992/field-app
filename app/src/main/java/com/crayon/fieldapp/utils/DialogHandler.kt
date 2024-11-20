package com.crayon.fieldapp.utils

import android.app.AlertDialog
import android.content.Context
import com.crayon.fieldapp.R

object DialogHandler {

    private var messageDialog: AlertDialog? = null
    fun showMessageDialog(context: Context, message: String, callback: () -> Unit = {}) {
        if (messageDialog == null) {
            messageDialog = AlertDialog.Builder(context, R.style.AlertDialogTheme)
                .setMessage(message)
                .setPositiveButton(
                    "Ok"
                ) { dialog, which ->
                    callback!!.invoke()
                }
                .show()
        } else {
            if (!messageDialog!!.isShowing) {
                messageDialog!!.show()
            }
        }

    }

    fun dismissMessageDialog() {
        if (messageDialog != null && messageDialog!!.isShowing) {
            messageDialog?.dismiss()
        }
        messageDialog = null
    }
}