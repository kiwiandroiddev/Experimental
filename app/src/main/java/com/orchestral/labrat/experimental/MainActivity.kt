package com.orchestral.labrat.experimental

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        main_recyclerview.layoutManager = LinearLayoutManager(this)
        main_recyclerview.adapter = HeaderWrapperAdapter(StaticItemsAdapter())
    }

}

