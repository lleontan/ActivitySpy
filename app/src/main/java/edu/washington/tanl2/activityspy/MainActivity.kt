package edu.washington.tanl2.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("tag","onCreate event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("tag","We’re going down, Captain!")

    }
}
