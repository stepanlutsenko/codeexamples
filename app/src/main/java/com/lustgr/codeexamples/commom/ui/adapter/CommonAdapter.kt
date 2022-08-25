package com.lustgr.codeexamples.commom.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CommonAdapter(private val viewHolderFactory: ViewHolderFactory) : RecyclerView.Adapter<CommonViewHolder>() {

    private val items: MutableList<CommonItemVm> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        return viewHolderFactory.getViewHolder(viewType, parent)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

    fun setItems(newItems: List<CommonItemVm>) {
        items.clear()
        items.addAll(newItems)
    }
}
