package com.example.revision

fun main(){
    val child = 5
    val adult = 28
    val senior = 65

    val isMonday=true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child,isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult,isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean):Int{
    if(isMonday)
        if (age>0 && age < 10)
            return 15
        else if (age > 10 && age < 40)
            return 25
        else if (age > 40)
            return 20
        else
            return 0
    return 0
}
