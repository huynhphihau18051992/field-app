package com.crayon.fieldapp.ui.widgets

import android.text.method.PasswordTransformationMethod
import android.view.View

class NumericKeyBoardTransformationMethod : PasswordTransformationMethod() {

    override fun getTransformation(source: CharSequence, view: View): CharSequence {
        return source
    }
}