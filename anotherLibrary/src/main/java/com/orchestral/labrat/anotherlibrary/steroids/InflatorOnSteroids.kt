package com.orchestral.labrat.anotherlibrary.steroids

import android.content.Context
import android.support.v4.view.LayoutInflaterFactory
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class InflaterOnSteroids(appCompatActivity1: AppCompatActivity) : LayoutInflaterFactory {

    override fun onCreateView(parent: View?, name: String, context: Context, attrs: AttributeSet): View? {
        if (name == "TextView") {
            val textView = TextView(context, attrs)
            textView.text = context.getStringRecurr(textView.text.toString())
            return textView
        }
        return null
    }

}
