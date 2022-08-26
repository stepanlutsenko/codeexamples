package com.lustgr.common.ui.adapter

import android.view.ViewGroup

interface ViewHolderFactory {

    fun getViewHolder(type: Int, parent: ViewGroup): CommonViewHolder
}
