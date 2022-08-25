package com.lustgr.codeexamples.post.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lustgr.codeexamples.commom.ui.adapter.CommonViewHolder
import com.lustgr.codeexamples.commom.ui.adapter.ViewHolderFactory
import com.lustgr.codeexamples.databinding.ItemPostImageBinding
import com.lustgr.codeexamples.databinding.ItemPostTextBinding

class PostViewHolderFactory : ViewHolderFactory {
    override fun getViewHolder(type: Int, parent: ViewGroup): CommonViewHolder {
        val binding = when (type) {
            ImagePostItemVM.TYPE ->
                ItemPostImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            TextPostItemVM.TYPE -> ItemPostTextBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            else -> throw IllegalStateException("could not create view holder for type: $type")
        }

        return CommonViewHolder(binding)
    }
}
