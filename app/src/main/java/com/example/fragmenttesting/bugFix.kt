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


class Movies() {
    fun showDetails() {
        println("Showing Movie Details from main branch")
    }

    fun showRuntime() {
        println("Showing the Runtime")
    }
}
class WebSeries(){
    fun showData(){
        println("Webseries data from the login branch")
    }
    fun showRuntime(){
        println("Showing run time of series from the login branch")
    }
}

