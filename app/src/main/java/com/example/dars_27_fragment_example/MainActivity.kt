package com.example.dars_27_fragment_example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), BlankFragment.BlankInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onAction() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
    }
}
