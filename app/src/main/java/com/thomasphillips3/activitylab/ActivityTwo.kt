package com.thomasphillips3.activitylab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private var onCreateCount = 0
private var onStartCount = 0
private var onResumeCount = 0
private var onRestartCount = 0

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        onCreateCount++
        onCreateCalls.text = onCreateCount.toString()
        onStartCalls.text = onStartCount.toString()
        onResumeCalls.text = onResumeCount.toString()
        onRestartCalls.text = onRestartCount.toString()

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

    fun startMainActivity(view: View) {
        val mainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(mainActivityIntent)

    }

    fun startMainActivityTwo(view: View) {}
}