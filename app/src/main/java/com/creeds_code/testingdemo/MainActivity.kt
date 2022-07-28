package com.creeds_code.testingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: EditText = findViewById(R.id.user_name)
        val sendMessage: View = findViewById(R.id.send_message)

        sendMessage.setOnClickListener{view ->
            val input = name.text.toString()
            val activityIntent = Intent(this,ReceiveMessageActivity::class.java)
            activityIntent.putExtra(USER_MESSAGE,input)
            startActivity(activityIntent)
        }
    }
}