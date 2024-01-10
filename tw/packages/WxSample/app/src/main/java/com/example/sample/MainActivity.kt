package com.example.sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.readFileButton).setOnClickListener {
            println("read file content: ${FileUtils.read("/vendor/firmware_mnt/verinfo/ver_info.txt")}")
        }
    }
}