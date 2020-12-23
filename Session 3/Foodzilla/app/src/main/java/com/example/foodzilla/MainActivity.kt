package com.example.foodzilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlace.setOnClickListener {
            Toast.makeText(getApplicationContext(),
                "Order Placed", Toast.LENGTH_LONG).show()
            val checkedBtn=radioGroup.checkedRadioButtonId
            val menu=findViewById<RadioButton>(checkedBtn)
            val cheese=btnCheese.isChecked
            val olive=btnOlives.isChecked
            val lettuce=btnLettuce.isChecked
            val onion=btnOnion.isChecked
            val ostring= "Your Order is \n"+
                    "${menu.text} "+
                    (if(cheese||olive||lettuce||onion) "\nwith Extra" else "")+
                    (if(cheese) "\nCheese" else "")+
                    (if(olive) "\nOlive" else "")+
                    (if(lettuce) "\nLettuce" else "")+
                    (if(onion) "\nOnion" else "")

            val intent=Intent(this, order::class.java)
            intent.putExtra("ostring",ostring)
            startActivity(intent)
        }

    }
}