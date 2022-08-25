package com.lustgr.codeexamples.commom.ui.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.lustgr.codeexamples.BR

class CommonViewHolder(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(itemVm: CommonItemVm) {
        viewDataBinding.setVariable(BR.itemVM, itemVm)
    }
}
