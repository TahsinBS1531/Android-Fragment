package com.example.fragmenttesting

fun main(){
    var color = Color().apply {
        showData()
        println("ALso Addeded")
    }
}

class Color(){
    fun showData(){
        println("This is from bugfix branch")
    }
}
