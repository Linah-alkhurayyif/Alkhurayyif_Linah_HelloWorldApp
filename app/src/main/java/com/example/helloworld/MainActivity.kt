package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hi Linah...")
        Log.d("MainActivity","Hi there")

        mathematicaOperations(7,10,"+");
        mathematicaOperations(7,10,"-");
        mathematicaOperations(7,10,"*");
        mathematicaOperations(7,10,"/");
        mathematicaOperations(7,0,"/");
        mathematicaOperations(7,30,"$");
    }
    fun mathematicaOperations(number1:Int,number2:Int,operation:String){
        Log.d("MainActivity","Hi in mathematicaOperations function")
        var result=0;
        when{
            operation=="*" ->{
                result =number1*number2
                println("$number1 $operation $number2 --> the result is $result")
            }
            operation=="+" ->{
                result =number1+number2
                println("$number1 $operation $number2 --> the result is $result")
            }
            operation=="-" ->{
                result =number1-number2
                println("$number1 $operation $number2 --> the result is $result")
            }
            operation=="/" ->{
                if(number2==0){
                    println("Sorry can not divide by zero")
                }else{
                    result =number1/number2
                    println("$number1 $operation $number2 --> the result is $result")
                }

            }
            else -> println("Enter valid operation")
        }
    }
}