package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number1= findViewById<EditText>(R.id.guessNumber).text
        var number2 =findViewById<TextInputLayout>(R.id.guessingNumber).editText?.text
        var count=0
        findViewById<TextView>(R.id.answer).setOnClickListener()
        {
            count++
            val newScreenIntent=Intent(this,MessageActivity::class.java)
            if (number1.toString().toInt() == number2.toString().toInt() && count<=12) {
                newScreenIntent.putExtra("value","Yes")
                newScreenIntent.putExtra("answer",number1.toString())
                startActivity(newScreenIntent)
                count=0
            }
            else if(number1.toString().toInt() != number2.toString().toInt()&&count==12)
            {
                newScreenIntent.putExtra("value","No")
                newScreenIntent.putExtra("answer",number1.toString())
                startActivity(newScreenIntent)
                count=0
            }
            else
            {
                findViewById<TextView>(R.id.hint).setText("Try Answer is wrong")
            }
        }
    }
}