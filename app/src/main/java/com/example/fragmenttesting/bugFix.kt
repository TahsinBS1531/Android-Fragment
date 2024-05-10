package com.example.fragmenttesting

fun main(){
    var color = Color().apply {
        showData()
        println("ALso Addeded")
    }
    println(Color.login())
}

class Color(){
    fun showData(){
        println("This is from bugfix branch")
    }
    companion object{
        fun login(){
            println("Login Functionality Added Successfully")
        }
    }
}

class Movies(){
    fun showDetails(){
        println("Showing Movie Details from main branch")
    }

    fun showRuntime(){
        println("Showing the Runtime")
    }
}

