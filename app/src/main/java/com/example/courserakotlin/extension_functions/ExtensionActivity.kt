package com.example.courserakotlin.extension_functions

fun main(){
    val x:Int = 5
    println(x.add(5))
    var list = mutableListOf("Onion", "Cheese", "Water" , "Salt")
    var dish = Dish("Onion Soup", list)

    dish.removeSalt()
    dish.printIngredientList()

}

fun Int.add(num1:Int):Int{
    return this+num1
}