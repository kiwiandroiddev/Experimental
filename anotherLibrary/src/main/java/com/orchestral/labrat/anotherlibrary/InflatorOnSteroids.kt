package com.orchestral.labrat.anotherlibrary

import android.content.Context
import android.support.v4.view.LayoutInflaterFactory
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class InflatorOnSteriods(val appCompatActivity: AppCompatActivity) : LayoutInflaterFactory {

    override fun onCreateView(parent: View, name: String, context: Context, attrs: AttributeSet): View? {
        if (name == "TextView") {
            val textview = TextView(context, attrs)
            textview.text = context.getStringRecurr(R.string.concated_string)

            return textview
        }
        return null
    }

}
