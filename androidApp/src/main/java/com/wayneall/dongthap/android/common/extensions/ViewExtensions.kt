package com.wayneall.dongthap.android.common.extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast

const val TAG = "DONGTHAP"

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}

fun writeLogs(message: String){
    Log.d(TAG, message)
}

fun View.isVisible(isVisible: Boolean){
    this.visibility = if(isVisible) View.VISIBLE
    else View.GONE
}