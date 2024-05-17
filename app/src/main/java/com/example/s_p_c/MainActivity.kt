package com.example.s_p_c

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var scoreTextView: TextView
    private lateinit var display : ImageView
    private lateinit var rockBtn : Button
    private lateinit var paperBtn : Button
    private lateinit var scissorsBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        scoreTextView=findViewById(R.id.scoreTextView)
        rockBtn=findViewById(R.id.rockBtn)
        display=findViewById(R.id.display)
        rockBtn=findViewById(R.id.rockBtn)
        paperBtn=findViewById(R.id.paperBtn)
        scissorsBtn=findViewById(R.id.scissorsBtn)

        rockBtn.setOnClickListener {
            display.setImageResource(R.drawable.paper)
            scoreTextView.text = "you win"

        }

        paperBtn.setOnClickListener {
            display.setImageResource(R.drawable.scissor)
            scoreTextView.text = "you lose"

        }

        scissorsBtn.setOnClickListener {
            display.setImageResource(R.drawable.paper)
            scoreTextView.text = "you win"

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}