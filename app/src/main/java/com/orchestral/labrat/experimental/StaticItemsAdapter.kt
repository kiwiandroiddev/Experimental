package com.orchestral.labrat.experimental

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class StaticItemsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = 5

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TextViewHolder(parent, "Item")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {}

}