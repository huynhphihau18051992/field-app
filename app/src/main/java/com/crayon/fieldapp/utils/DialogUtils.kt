package com.crayon.fieldapp.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AlertDialog
import com.crayon.fieldapp.R
import kotlinx.android.synthetic.main.dialog_otp_failed.*
import kotlinx.android.synthetic.main.dialog_otp_success.*


fun Context?.createLoadingDialog(
    cancelable: Boolean = false,
    canceledOnTouchOutside: Boolean = false
): AlertDialog? {
    val context = this ?: return null
    return AlertDialog.Builder(context)
        .setView(R.layout.layout_loading_dialog)
        .create().apply {
            setCancelable(cancelable)
            setCanceledOnTouchOutside(canceledOnTouchOutside)
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
}

fun Context?.showLoadingDialog(
    cancelable: Boolean = false,
    canceledOnTouchOutside: Boolean = false
): AlertDialog? {
    this ?: return null
    val dialog: AlertDialog? = createLoadingDialog(
        cancelable = cancelable,
        canceledOnTouchOutside = canceledOnTouchOutside
    )
    dialog?.show()
    return dialog
}

fun Context?.showDialog(
    title: String? = null, message: String? = null,
    textPositive: String? = null, positiveListener: (() -> Unit)? = null,
    textNegative: String? = null, negativeListener: (() -> Unit)? = null,
    cancelable: Boolean = false, canceledOnTouchOutside: Boolean = true
): AlertDialog? {
    val context = this ?: return null
    return AlertDialog.Builder(context, R.style.AlertDialogTheme)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(
            android.R.string.yes
        ) { dialog, which ->
            positiveListener?.invoke()
        }
        .setNegativeButton(android.R.string.no, null)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .show()
}

fun Context?.showConfirmDialog(
    title: String? = null, message: String? = null,
    textPositive: String, positiveListener: (() -> Unit),
    textNegative: String
): AlertDialog? {
    val context = this ?: return null
    return AlertDialog.Builder(context, R.style.AlertDialogTheme)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(
            textPositive
        ) { dialog, which ->
            positiveListener!!.invoke()
        }
        .setNegativeButton(textNegative, null)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .show()
}


fun Context?.showMessageDialog(
    title: String? = null, message: String? = null,
    positiveListener: (() -> Unit)? = null
): AlertDialog? {
    val context = this ?: return null
    return AlertDialog.Builder(context, R.style.AlertDialogTheme)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(
            android.R.string.yes
        ) { dialog, which ->
            positiveListener?.invoke()
        }
        .setIcon(android.R.drawable.ic_dialog_alert)
        .show()


}


fun Context?.showDialog(
    title: Int? = null, message: Int? = null,
    textPositive: Int? = null, positiveListener: (() -> Unit)? = null,
    textNegative: Int? = null, negativeListener: (() -> Unit)? = null,
    cancelable: Boolean = false, canceledOnTouchOutside: Boolean = true
): AlertDialog? {
    val context = this ?: return null
    return AlertDialog.Builder(context, R.style.AlertDialogTheme).apply {
        if (title != null) setTitle(title)
        if (message != null) setMessage(message)
        if (textPositive != null) {
            setPositiveButton(textPositive) { dialog, which ->
                positiveListener?.invoke()
            }
        }
        if (textNegative != null) {
            setNegativeButton(textNegative) { dialog, which ->
                negativeListener?.invoke()
            }
        }
        setCancelable(cancelable)
    }.create().apply {
        setCanceledOnTouchOutside(canceledOnTouchOutside)
        show()
    }
}