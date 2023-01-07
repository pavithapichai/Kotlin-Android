package com.example.courserakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity


class FoodItemListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_item_list)
        findViewById<View>(R.id.main_dish_1).setOnClickListener{
            intent = Intent(this,CartActivity::class.java)
            intent.putExtra("dish_name","pasta")
            startActivity(intent)
        }
        findViewById<View>(R.id.main_dish_2).setOnClickListener{
            intent = Intent(this,CartActivity::class.java)
            intent.putExtra("dish_name","soda")
            startActivity(intent)
            //startActivity(CartActivity)
           // CartActivity.startActivity(this,"pasta")
        }
    }
}