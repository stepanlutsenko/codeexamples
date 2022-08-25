package com.lustgr.codeexamples

import android.app.Application
import com.lustgr.codeexamples.post.di.postsScreenModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.context.loadKoinModules

class CodeExamplesApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            loadKoinModules(postsScreenModule)
        }
    }
}
