package com.thomasphillips3.activitylab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

private var onCreateCount = 0
private var onStartCount = 0
private var onResumeCount = 0
private var onRestartCount = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onCreateCount++
        onCreateCalls.text = onCreateCount.toString()
    }

    override fun onStart() {
        super.onStart()
        onStartCount++
        onStartCalls.text = onStartCount.toString()
    }

    override fun onResume() {
        super.onResume()
        onResumeCount++
        onResumeCalls.text = onResumeCount.toString()
    }

    override fun onRestart() {
        super.onRestart()
        onRestartCount++
        onRestartCalls.text = onRestartCount.toString()
    }
}