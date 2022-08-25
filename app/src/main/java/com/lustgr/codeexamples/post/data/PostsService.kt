package com.lustgr.codeexamples.post.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface PostsService {

    fun getPosts(): Flow<List<PostApi>>
}

class StubPostsService : PostsService {

    override fun getPosts(): Flow<List<PostApi>> {
        return flow {
            emit(
                List(100) { idx ->
                    if (idx % 3 == 0){
                        createImagePost(idx.toLong())
                    } else {
                        createTextPost(idx.toLong())
                    }
                }

            )
        }
    }

    private fun createTextPost(id: Long) = PostApi.Text(
        id = id,
        title = "Title $id",
        description = "Some short description of $id item with type of post",
        text = "Some text of $id item with type of post it maybe very long. Some text of $id item with type of post it maybe very long. Some text of $id item with type of post it maybe very long."
    )

    private fun createImagePost(id: Long) = PostApi.Image(
        id = id,
        title = "Title $id",
        description = "Some short description of $id item with type of image",
        url = "url for image with id $id will be here"
    )
}
