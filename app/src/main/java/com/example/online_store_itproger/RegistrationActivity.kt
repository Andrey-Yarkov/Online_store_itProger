package com.example.online_store_itproger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        var buttonRegister : Button = findViewById(R.id.registration_button)
        buttonRegister.setOnClickListener {
            
        }
    }
}