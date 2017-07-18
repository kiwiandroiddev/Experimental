package com.orchestral.labrat.experimental

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class TextViewHolder(parent: ViewGroup, itemText: String) : RecyclerView.ViewHolder(
        TextView(parent.context).apply { text = itemText })