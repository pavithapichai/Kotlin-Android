package com.example.courserakotlin

class TaxCalculator {
    companion object {
        val salesTaxPercantage =15.0
        fun getTaxAmountForOrderItems(orderItems:List<OrderItem>):Double{
            var orderAmount = 0.00
            for (item in orderItems){

                orderAmount += item.price ;
            }
            return (orderAmount * salesTaxPercantage)/100
        }
    }
    fun add(a:Int,b:Int):Int{
        return a+b
    }
}