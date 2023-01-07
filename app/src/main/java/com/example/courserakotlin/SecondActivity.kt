package com.example.courserakotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity(){
    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.main)
        println(Order.DeliveryDetails().deliveryFeeInDollars);

    }
}