package com.example.bithdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val nameInput:EditText=findViewById(R.id.nameInput)
        val name  = nameInput.editableText.toString()

        val intent = Intent(this, BirthdatGreetingActivity::class.java)
        intent.putExtra(BirthdatGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)


    }
}