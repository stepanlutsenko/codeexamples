package com.lustgr.codeexamples.post.presentation

import com.lustgr.codeexamples.commom.ui.adapter.CommonItemVm
import com.lustgr.codeexamples.post.domain.Post

class ImagePostItemVM(data: Post.Image) : CommonItemVm {

    override val type: Int = TYPE

    val title: String = data.title

    companion object {
        const val TYPE = 1
    }
}
