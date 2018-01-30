package com.ijb.nbt.firstkotlinproj.helper

import android.text.TextUtils
import android.widget.EditText
import android.widget.TextView

// TODO : Extension 함수
fun String.isEmptyString(string: String) :  Boolean {
    return TextUtils.isEmpty(string) || string == "null"
}

internal inline fun EditText.validateWith
        (validator: TextView.() -> Boolean): Boolean {
    return validator()
}
