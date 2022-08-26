package com.lustgr.codeexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lustgr.codeexamples.post.PostsFragment
import org.koin.androidx.fragment.android.replace

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace<PostsFragment>(R.id.main_root_fragment_container)
            .commitNow()
    }
}
