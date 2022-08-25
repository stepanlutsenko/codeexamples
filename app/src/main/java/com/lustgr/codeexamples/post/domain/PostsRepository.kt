package com.lustgr.codeexamples.post.domain

import kotlinx.coroutines.flow.Flow

interface PostsRepository {

    fun getPosts(): Flow<List<Post>>
}
