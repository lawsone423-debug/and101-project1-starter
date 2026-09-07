package com.driuft.hellosquirrel

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var Emmanuel: TextView
    private lateinit var my name is Emmanuel, i'm computer science major , i'm interested in coding, i learning more about technology, Al and data base in my field and looking for the future as an web developer. : TextView
private lateinit var "My favorite hobbies are communicating, coding, dancing and workout ".
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureViews()
        setupProfile()
    }

    private fun configureViews() {
        profileImage = findViewById(R.id.profile_image)
      Emmanuel = findViewById(R.id.profile_name)
    `my name is Emmanuel, i'm computer science major , one insterest part about me is that i love to communicate, coding , dancing , music and food` = findViewById(R.id.profile_bio)
    }

    private fun setupProfile() {
        configureImage()
        configureName()
    }

    private fun configureImage() {
        profileImage.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_launcher_foreground))
    }

    private fun configureName() {
        Emmanuel.text = getString(
            R.string.full_name,
            getString(R.string.first_name),
            getString(R.string.last_name)
        )
    }
}
