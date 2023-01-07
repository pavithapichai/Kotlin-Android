package com.example.courserakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        var ingredientView  = findViewById<TextView>(R.id.food_list_item)
         var dishName:String?= intent.getStringExtra("dish_name")
        if(dishName.equals("pasta"))
            ingredientView.text ="sauce\n pepporoni\nchicken"
        else
            ingredientView.text = "lemon"

    }
}