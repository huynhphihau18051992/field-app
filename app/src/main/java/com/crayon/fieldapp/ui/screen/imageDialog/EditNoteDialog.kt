package com.crayon.fieldapp.ui.screen.imageDialog

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick
import com.github.chrisbanes.photoview.OnSingleFlingListener
import kotlinx.android.synthetic.main.dialog_add_note.*
import kotlinx.android.synthetic.main.dialog_image.*
import kotlinx.android.synthetic.main.dialog_image.photo_view


class EditNoteDialog(
    private var index: Int,
    private var note: String? = null,
    private val imageUrl: String
) :
    DialogFragment() {

    var mListener: EditNoteListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_add_note, container, false).apply {

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        note?.let {
            edtNote.setText(it)
        }

        imb_ic_back.setSingleClick {
            dismiss()
        }

        imb_ic_save.setSingleClick {
            var note = edtNote.text.toString().toString()
            this.mListener?.onEditNote(note, index)
            dismiss()
        }

        photo_view.setOnSingleFlingListener(object : OnSingleFlingListener {
            override fun onFling(
                e1: MotionEvent,
                e2: MotionEvent,
                velocityX: Float,
                velocityY: Float
            ): Boolean {
                try {
                    val diffY: Float = e2.getY() - e1.getY()
                    val diffX: Float = e2.getX() - e1.getX()
                    if (Math.abs(diffX) > Math.abs(diffY)) {
                        if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                            if (diffX > 0) {
                                this@EditNoteDialog.dismiss()
                            } else {
                                this@EditNoteDialog.dismiss()
                            }
                            return true
                        }
                    } else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(
                            velocityY
                        ) > SWIPE_VELOCITY_THRESHOLD
                    ) {
                        if (diffY > 0) {
                            this@EditNoteDialog.dismiss()
                        } else {
                            this@EditNoteDialog.dismiss()
                        }
                        return true
                    }
                } catch (exception: Exception) {
                    exception.printStackTrace()
                }

                return false
            }

        })

        Glide.with(this)
            .asBitmap()
            .load(imageUrl)
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    photo_view.setImageBitmap(resource)
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {

            // Set gravity of dialog
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            val lp = window.attributes

            // Set Over touch screen is transparent
            lp.dimAmount = 0.2f
            lp.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
            dialog.window?.attributes = lp
        }
    }

    interface EditNoteListener {
        fun onEditNote(note: String, index: Int)
    }

    fun setEditNoteListener(listener: EditNoteListener) {
        this.mListener = listener
    }

    companion object {
        private const val SWIPE_THRESHOLD = 100
        private const val SWIPE_VELOCITY_THRESHOLD = 100
    }
}