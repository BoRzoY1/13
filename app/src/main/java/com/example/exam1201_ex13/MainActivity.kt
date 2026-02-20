package com.example.exam1201_ex13

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image)

        findViewById<Button>(R.id.btnAlpha).setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha))
        }
        findViewById<Button>(R.id.btnRotate).setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        }
        findViewById<Button>(R.id.btnScale).setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale))
        }
        findViewById<Button>(R.id.btnTranslate).setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
        }
    }
}