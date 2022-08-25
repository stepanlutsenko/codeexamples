package com.lustgr.codeexamples.post.domain

sealed class Post(val id: Long, val title: String, val description: String) {

    class Text(id: Long, title: String, description: String, val text: String) : Post(id, title, description)
    class Image(id: Long, title: String, description: String, val url: String) : Post(id, title, description)
}
