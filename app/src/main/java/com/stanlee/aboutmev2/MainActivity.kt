package com.stanlee.aboutmev2


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aButton = findViewById<Button>(R.id.btn_phone)
        aButton.setOnClickListener {
            val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:08032324739"))
            startActivity(phoneIntent)
        }

        val bButton = findViewById<Button>(R.id.btn_email)
        bButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "manstylo@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello Stan Lee!")
            startActivity(emailIntent)
        }

        val cButton = findViewById<Button>(R.id.btn_location)
        cButton.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=3 Abike Close off Miyaki street, Oworonshoki, Lagos"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}