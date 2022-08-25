package com.lustgr.codeexamples.post.domain

import kotlinx.coroutines.flow.Flow

class PostsScreenModel(private val postsRepository: PostsRepository) {

    fun getPosts(): Flow<List<Post>> = postsRepository.getPosts()
}
