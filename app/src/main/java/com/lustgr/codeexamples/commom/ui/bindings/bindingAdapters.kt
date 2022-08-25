package com.lustgr.codeexamples.commom.ui.bindings

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lustgr.codeexamples.commom.ui.adapter.CommonAdapter
import com.lustgr.codeexamples.commom.ui.adapter.CommonItemVm
import com.lustgr.codeexamples.commom.ui.adapter.ViewHolderFactory

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
