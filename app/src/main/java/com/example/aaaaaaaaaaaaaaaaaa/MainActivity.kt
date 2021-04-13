package com.example.aaaaaaaaaaaaaaaaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.dice).setOnClickListener {
            MainScope().launch {
                for (i in 0..269) {
                    it.rotationY = it.rotationY + 1
                    delay(1)
                }
                findViewById<ImageView>(R.id.dice).setImageResource(
                    when ((1..6).random()) {
                        1 -> R.drawable.one
                        2 -> R.drawable.two
                        3 -> R.drawable.tree
                        4 -> R.drawable.four
                        5 -> R.drawable.five
                        6 -> R.drawable.six
                        else -> R.drawable.ic_launcher_foreground
                    } )

                for (i in 270..359) {
                    it.rotationY = it.rotationY + 1
                    delay(1)
                }



                for (i in 0..359) {
                    it.rotationX= it.rotationX + 1
                    delay(1)
                }


            }
        }
    }
}