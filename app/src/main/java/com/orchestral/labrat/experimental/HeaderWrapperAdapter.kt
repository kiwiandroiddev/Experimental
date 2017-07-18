package com.orchestral.labrat.experimental

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class HeaderWrapperAdapter(val wrappedAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val HEADER_VIEW_TYPE = -1
        private const val NUM_HEADER_ITEMS = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            when (viewType) {
                HEADER_VIEW_TYPE -> TextViewHolder(parent, "Header")
                else -> wrappedAdapter.onCreateViewHolder(parent, viewType)
            }

    override fun getItemCount(): Int = wrappedAdapter.itemCount + NUM_HEADER_ITEMS

    override fun getItemViewType(position: Int) =
            if (position == 0)
                HEADER_VIEW_TYPE
            else
                wrappedAdapter.getItemViewType(position - NUM_HEADER_ITEMS)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position > 0) {
            val wrappedAdapterPosition = position - NUM_HEADER_ITEMS
            wrappedAdapter.onBindViewHolder(holder, wrappedAdapterPosition)
        }
    }

}