/*
package com.example.revision

fun main(){
    printFinalTemperature(27.0,"celcius","fahrenheit"){c->(c*9/5)+32}
    printFinalTemperature(350.0,"kelvin","celcius"){k->k-273.15}
    printFinalTemperature(10.0,"fahrenheit","kelvin"){f -> (f - 32) * 5/9 + 273.15 }
}
fun printFinalTemperature(
    initialMeasurement :Double,
    initialUnit: String,
    finalUnit : String,
    conversionFormula:(Double)-> Double
    ){
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
*/
