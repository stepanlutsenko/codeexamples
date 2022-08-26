package com.lustgr.codeexamples.post.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lustgr.codeexamples.BR
import com.lustgr.codeexamples.databinding.ItemPostImageBinding
import com.lustgr.codeexamples.databinding.ItemPostTextBinding
import com.lustgr.common.ui.adapter.CommonViewHolder
import com.lustgr.common.ui.adapter.ViewHolderFactory

class PostViewHolderFactory : ViewHolderFactory {
    override fun getViewHolder(type: Int, parent: ViewGroup): CommonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = when (type) {
            ImagePostItemVM.TYPE -> ItemPostImageBinding.inflate(inflater, parent, false)
            TextPostItemVM.TYPE -> ItemPostTextBinding.inflate(inflater, parent, false)
            else -> throw IllegalStateException("could not create view holder for type: $type")
        }

        return CommonViewHolder(binding, BR.itemVM)
    }
}
