package com.example.courserakotlin.extension_functions

class Dish ( val dishName:String,
             val ingridients:MutableList<String>)

fun Dish.printIngredientList(){
    println(ingridients)
}
fun Dish.removeSalt( ){
    ingridients.remove("Salt")
}