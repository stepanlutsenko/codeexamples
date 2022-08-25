package com.lustgr.codeexamples.post.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.lustgr.codeexamples.post.domain.Post
import com.lustgr.codeexamples.post.domain.PostsScreenModel
import kotlinx.coroutines.flow.map

class PostsScreenViewModel(model: PostsScreenModel) : ViewModel() {

    val posts = model.getPosts().map { items ->
        items.map { post ->
            when (post) {
                is Post.Image -> ImagePostItemVM(post)
                is Post.Text -> TextPostItemVM(post)
            }
        }
    }.asLiveData()
}
