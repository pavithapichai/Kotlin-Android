package com.example.courserakotlin

class Order (val amountBeforTax:Int){
    val orderId = 1
    class DeliveryDetails{
        val deliveryFeeInDollars = 10
    }
    inner  class TaxDetails {
        val TaxAmount = 0.25 * amountBeforTax
    }
    companion object{
        const val TAX_PERCENTAGE = 5

        fun getOrderAmount(orderAmount:Int): Double {
            return orderAmount + (orderAmount * TAX_PERCENTAGE /100).toDouble()
        }
    }
}
