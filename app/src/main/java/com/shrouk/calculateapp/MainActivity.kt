package com.shrouk.calculateapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText=findViewById(R.id.num1)
        //make the input type for num1 to  only numbers
        num1.inputType = InputType.TYPE_CLASS_NUMBER

        val num2:EditText=findViewById(R.id.num2)
        //make the input type for num2 to  only numbers
        num2.inputType = InputType.TYPE_CLASS_NUMBER

       //Toast extension function..
        fun Any.toast(context:Context, duration: Int = Toast.LENGTH_SHORT) {
            return Toast.makeText(context, this.toString(), duration). show()
        }

        val sum:Button=findViewById(R.id.btnsum)
        sum.setOnClickListener {
            if((num1.text.toString() == "") or (num2.text.toString() == ""))
                "Enter Number".toast(this)
            else{
                val number1=num1.text.toString().toInt()
                val number2=num2.text.toString().toInt()

                val result=number1+number2

                 "The Summation is $result".toast(this)
        }

        }



    }
}