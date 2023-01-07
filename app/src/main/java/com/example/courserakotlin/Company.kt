package com.example.courserakotlin

object Company {
    val customers : MutableList<String> = mutableListOf()

    fun addCustomers(customer:String){
        customers.add(customer)
    }
    fun removeCustomers(customer:String){
        customers.remove(customer)
    }
}