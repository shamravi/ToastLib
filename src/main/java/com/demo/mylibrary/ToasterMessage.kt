package com.demo.mylibrary

import android.content.Context
import android.widget.Toast


public object ToasterMessage {
    public fun show(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}