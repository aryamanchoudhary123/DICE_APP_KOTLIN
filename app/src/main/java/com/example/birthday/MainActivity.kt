package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countButton : Button= findViewById(R.id.count_button)
        countButton.setOnClickListener{ counter()}


    }

    private fun rollDice(){
        //Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        val randomInt= (1..6).random()
        val resultText: TextView = findViewById(R.id.result)
        resultText.text=randomInt.toString()

    }

    private fun counter(){
            val initialText : TextView = findViewById(R.id.result)
            val str : String = initialText.text.toString()

            if(str== "Hello World!"){
                val ans = 1
                initialText.text=ans.toString()
            }

            else if ( str!="6"){
                var ans= str.toInt()
                ans+=1
                initialText.text=ans.toString()

            }
        //Toast.makeText(this,initialText.text,Toast.LENGTH_SHORT).show()

    }

}
