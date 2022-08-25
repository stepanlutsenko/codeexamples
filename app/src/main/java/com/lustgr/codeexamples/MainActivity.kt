package com.lustgr.codeexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lustgr.codeexamples.databinding.ActivityMainBinding
import com.lustgr.codeexamples.post.presentation.PostViewHolderFactory
import com.lustgr.codeexamples.post.presentation.PostsScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val postsScreenViewModel: PostsScreenViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).apply {
            lifecycleOwner = this@MainActivity
            vm = postsScreenViewModel
            viewHolderFactory = PostViewHolderFactory()
            setContentView(root)
        }
    }
}
