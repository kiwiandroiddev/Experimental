package com.orchestral.labrat.anotherlibrary


import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView


class SecondActivity : AppCompatActivity() {

    lateinit var mInflater: LayoutInflater
    lateinit var mPrefix: String

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_second)
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        if (name == "TextView") {
            val textview = TextView(this, attrs)
            textview.text = getStringRecurr(R.string.concated_string)
            return textview
        }
        return null
    }

}


