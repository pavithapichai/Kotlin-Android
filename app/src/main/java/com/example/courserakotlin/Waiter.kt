package com.example.courserakotlin

class Waiter : Personnel{
    var id:Int = -1
    var name : String = ""
    override fun serveCustomer() {
        TODO("Not yet implemented")
    }
    companion object{
        var branchName:String = ""
        var branchAddress:String = ""
    }

}