package com.example.bithdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_birthdat_greeting.*

class BirthdatGreetingActivity: AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdat_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)

        birthdayGreeting.text = "Happy Birthday\n $name!"

    }
}