package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtbmi:TextView
    private lateinit var  txtdisplayresult:TextView
    private lateinit var edtweight:EditText
    private lateinit var edtheight:EditText
    private lateinit var btncalculate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtbmi = findViewById(R.id.txtbmi)
        txtdisplayresult = findViewById(R.id.txtdisplayresult)
        edtweight = findViewById(R.id.edtweight)
        edtheight =findViewById(R.id.edtheight)
        btncalculate =findViewById(R.id.btncalculate)


        btncalculate.setOnClickListener {

            var weight = edtweight.text.toString().trim() //50
            var height = edtheight.text.toString().trim() //20

            //validation of edit text
            if (weight.isEmpty() || height.isEmpty()){
                Toast.makeText(this, "Please enter valid number", Toast.LENGTH_SHORT).show()
            }  else{
                //means has some data
                var result = weight.toDouble() / (height.toDouble() * height.toDouble())
                txtdisplayresult.text = result.toString()


            }

        }


    }
}