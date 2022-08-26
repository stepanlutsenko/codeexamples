package com.lustgr.codeexamples.post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lustgr.codeexamples.R
import com.lustgr.codeexamples.databinding.FragmentPostsBinding
import com.lustgr.codeexamples.post.presentation.PostViewHolderFactory
import com.lustgr.codeexamples.post.presentation.PostsScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostsFragment: Fragment(R.layout.fragment_posts) {

    private val postsScreenViewModel: PostsScreenViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentPostsBinding.inflate(layoutInflater).apply {
            lifecycleOwner = this@PostsFragment
            vm = postsScreenViewModel
            viewHolderFactory = PostViewHolderFactory()
        }.root
    }
}