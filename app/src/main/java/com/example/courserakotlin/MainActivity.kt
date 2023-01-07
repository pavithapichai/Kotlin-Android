package com.example.courserakotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Company()
        Waiter.branchAddress = "Jo Street , california"
        Waiter.branchName = "Little Lemon Main Branch"
         val order = Order(100)
        val orderDetails = order.TaxDetails()
        println(orderDetails.TaxAmount)

        var item1 :OrderItem = OrderItem("Burger ",8.00)
        var item2 :OrderItem = OrderItem("Fries  ",4.00)
        var item3 :OrderItem = OrderItem("Soda ",2.00)
        val orderItems:List<OrderItem> = listOf(item1,item2,item3)
        println(TaxCalculator.getTaxAmountForOrderItems(orderItems))
        println(getNetAmount())

    }
    fun getNetAmount():Double{
        return Order.getOrderAmount(500)

    }

}