package com.rohindh.smoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val tag = "lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        Log.d(tag,"${javaClass.simpleName}: onCreate")
    }

    override fun onStart() {
        Log.d(tag,"${javaClass.simpleName}: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag,"${javaClass.simpleName}: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag,"${javaClass.simpleName}: onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(tag,"${javaClass.simpleName}: onRestart")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(tag,"${javaClass.simpleName}: onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag,"${javaClass.simpleName}: onDestroy")
        super.onDestroy()
    }
}
