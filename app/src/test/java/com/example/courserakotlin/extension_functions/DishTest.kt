package com.example.courserakotlin.extension_functions

import com.example.courserakotlin.OrderItem
import com.example.courserakotlin.TaxCalculator
import org.junit.Assert.assertEquals
import org.junit.Test

internal class DishTest{
    private val classUnderTest = TaxCalculator()

    @Test
    fun `validate taxCalculation`(){
        var item1 : OrderItem = OrderItem("Burger ",8.00)
        var item2 : OrderItem = OrderItem("Fries  ",4.00)
        var item3 : OrderItem = OrderItem("Soda ",2.00)
        val orderItems:List<OrderItem> = listOf(item1,item2,item3)
        val result:Double = TaxCalculator.getTaxAmountForOrderItems(orderItems)
        println(result)
        assertEquals(2.1,result,2.2)
    }
}