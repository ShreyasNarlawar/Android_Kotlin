package com.example.revision

//fun main() {
/*    var fn: (a: Int, b: Int) -> Int = ::sum
    val lambda1={x:Int,y:Int->x+y}
    val multiLinelambda2={
        println("Heloo From lambda2")
        val a=2+4
        "Helllo"
        2
    }
    multiLinelambda2()
    println(multiLinelambda2())
}
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun calculator(a:Int,b:Int,gg:(Int,Int)->Int){
    val result = gg(a,b)
    println(result)
}*/


/*fun main() {

//    val trickfunct = trick
//    trick()
//    treat()
//    trickfunct()
    val functTreat = treatOrTreat(false)
    val functTreak = treatOrTreat(false)
//    functTreak()
//    functTreat()
    println(functTreak())
}
    val trick = {
        println("hello tricker")
    }
    val treat:()-> Unit = {
        println("hello Treater")
    }

fun treatOrTreat(isTrick: Boolean):()->Unit {
    if(isTrick){
        return trick
    }else {
        return treat
    }
}*/

/*
fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()
}
val trick = {
    println("hello tricker")
}
val treat:()-> Unit = {
    println("hello Treater")
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if(extraTreat!=null)
        println(extraTreat(5))
        return treat
    }
}*/
