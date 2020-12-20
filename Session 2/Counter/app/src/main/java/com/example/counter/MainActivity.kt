package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cnt=0
        btnAdd.setOnClickListener {
            cnt++
            disp.text="Your Count Score : $cnt"
        }
        btnSub.setOnClickListener {
            cnt--
            disp.text="Your Count Score : $cnt"
        }
    }


}

