package com.orchestral.labrat.anotherlibrary

import android.content.Context
import android.support.v4.view.LayoutInflaterFactory
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class InflatorOnSteriods(appCompatActivity1: AppCompatActivity) : LayoutInflaterFactory {

    var appCompatActivity: AppCompatActivity

    init {
        this.appCompatActivity = appCompatActivity1
    }

    override fun onCreateView(parent: View, name: String, context: Context, attrs: AttributeSet): View? {
        if (name == "TextView") {
            val textview = TextView(context, attrs)
            textview.text = context.getStringRecurr(textview.text.toString())
            return textview
        }
        return null
    }


}
