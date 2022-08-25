package com.lustgr.codeexamples.post.data

sealed class PostApi(val id: Long, val title: String, val description: String) {

    class Text(id: Long, title: String, description: String, val text: String) : PostApi(id, title, description)
    class Image(id: Long, title: String, description: String, val url: String) : PostApi(id, title, description)
}
