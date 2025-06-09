package com.example.digitaltojbih


import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button1: ImageButton
    private lateinit var button2: Button
    private lateinit var button3: Button
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        val mediaPlayer = MediaPlayer.create(this, R.raw.bip)


        button1.setOnClickListener {
            count++
            textView.text = count.toString()
            mediaPlayer.start()
        }


        button2.setOnClickListener {
            if (count > 0) {
                count--
                textView.text = count.toString()
            }
        }

        button3.setOnClickListener {
            count = 0
            textView.text = count.toString()
        }

    }
}
