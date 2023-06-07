// https://qiita.com/iTakahiro/items/b5fe2b186750c6e774e5
package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.frameLayout, FootballFragment())

        println("1. Begin: Thread=${Thread.currentThread().name}")

        GlobalScope.launch(Dispatchers.IO) {
            println("2. Second: Thread=${Thread.currentThread().name}")
            test_print()
        }
        Thread.sleep(10)
        println("3. End: Thread=${Thread.currentThread().name}")
    }

    suspend fun test_print() {
        Thread.sleep(1000)
        println("4. Suspend: Thread=${Thread.currentThread().name}")
    }
}