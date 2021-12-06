package com.example.task3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val value=intent.getStringExtra("value")
        val answer=intent.getStringExtra("answer")
        if(value=="No")
        {
            findViewById<TextView>(R.id.answer1).setTextColor(Color.RED)
            findViewById<TextView>(R.id.answer1).setText("$answer")
            findViewById<TextView>(R.id.message).setText("You Lost After 12 attempts. the Number is")
        }
        else if(value=="Yes")
        {
            findViewById<TextView>(R.id.answer1).setTextColor(Color.GREEN)
            findViewById<TextView>(R.id.answer1).setText("$answer")
            findViewById<TextView>(R.id.message).setText("You Won the Number is")
        }
    }
}