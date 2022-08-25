package com.lustgr.codeexamples.post.di

import com.lustgr.codeexamples.post.data.PostsRepositoryImpl
import com.lustgr.codeexamples.post.data.PostsService
import com.lustgr.codeexamples.post.data.StubPostsService
import com.lustgr.codeexamples.post.domain.PostsRepository
import com.lustgr.codeexamples.post.domain.PostsScreenModel
import com.lustgr.codeexamples.post.presentation.PostsScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val postsScreenModule = module {
    singleOf(::StubPostsService) { bind<PostsService>() }
    singleOf(::PostsRepositoryImpl) { bind<PostsRepository>() }
    factoryOf(::PostsScreenModel)
    viewModelOf(::PostsScreenViewModel)
}
