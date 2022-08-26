package com.lustgr.common.ui.adapter

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("app:setItems", "app:viewHolderFactory")
fun setItems(view: RecyclerView, items: List<CommonItemVm>, viewHolderFactory: ViewHolderFactory) {

    if (view.adapter == null) {
        view.adapter = CommonAdapter(viewHolderFactory)
    }

    (view.adapter as CommonAdapter).setItems(items)
}

@BindingAdapter("app:setStringToText")
fun setText(view: TextView, text: String) {
    view.text = text
}
