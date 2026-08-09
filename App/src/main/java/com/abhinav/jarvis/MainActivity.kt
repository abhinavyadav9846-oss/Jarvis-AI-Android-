package com.abhinav.jarvis

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Hello Abhinav!\n\nJARVIS is starting..."
            textSize = 24f
            setPadding(40, 100, 40, 40)
        }

        setContentView(textView)
    }
}
