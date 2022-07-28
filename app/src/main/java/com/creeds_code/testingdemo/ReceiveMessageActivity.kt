package com.creeds_code.testingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar


private const val TAG = "ReceiveMessageActivity"

class ReceiveMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)
        val text: TextView = findViewById(R.id.message)
        val saveButton: Button = findViewById(R.id.save_button)


        val message: String? = intent?.getStringExtra(USER_MESSAGE) ?: "No entry yet!"
        text.text = message
        saveButton.setOnClickListener{view ->
            if (message != null) {
                Snackbar.make(view,"Saved Successfully",Snackbar.LENGTH_SHORT)
                    .show()
                Log.i(TAG, message)
            }
        }
    }
}