package com.lustgr.codeexamples.post.presentation

import com.lustgr.codeexamples.commom.ui.adapter.CommonItemVm
import com.lustgr.codeexamples.post.domain.Post

class TextPostItemVM(data: Post.Text) : CommonItemVm {

    override val type: Int = TYPE

    val title: String = data.title

    companion object {
        const val TYPE = 2
    }
}
