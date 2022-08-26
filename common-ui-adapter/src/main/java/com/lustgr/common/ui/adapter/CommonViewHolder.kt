package com.lustgr.common.ui.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class CommonViewHolder(
    private val viewDataBinding: ViewDataBinding,
    private val variableIdentifier: Int
) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(itemVm: CommonItemVm) {
        viewDataBinding.setVariable(variableIdentifier, itemVm)
    }
}
