package com.lustgr.codeexamples.post.data

import com.lustgr.codeexamples.post.domain.Post
import com.lustgr.codeexamples.post.domain.PostsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PostsRepositoryImpl(private val postsService: PostsService) : PostsRepository {

    override fun getPosts(): Flow<List<Post>> {
        return postsService.getPosts().map { postsApi ->
            postsApi.map(PostApi::mapToDomain)
        }
    }
}

private fun PostApi.mapToDomain(): Post {
    return when (this) {
        is PostApi.Image -> Post.Image(
            id = id,
            title = title,
            description = description,
            url = url
        )
        is PostApi.Text -> Post.Text(
            id = id,
            title = title,
            description = description,
            text = text
        )
    }
}
