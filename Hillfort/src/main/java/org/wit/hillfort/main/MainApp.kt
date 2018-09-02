package org.wit.hillfort.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.hillfort.models.HillfortFirebaseStore
import org.wit.hillfort.models.HillfortStore
// Initialize application with Firebase and local storage
import org.wit.hillfort.models.UserJSONStore
import org.wit.hillfort.models.UserStore
// Initialize core components before activity creation
// Initialize app context and default data stores
// Initialize stores and load persistent user session
// Initialize application stores and dependencies on startup

class MainApp : Application(), AnkoLogger {

    lateinit var hillforts: HillfortStore
    lateinit var users: UserStore

    override fun onCreate() {
        super.onCreate()
        hillforts = HillfortFirebaseStore(applicationContext)
        users = UserJSONStore(applicationContext)
        info("Hillfort Started!")
    }
}