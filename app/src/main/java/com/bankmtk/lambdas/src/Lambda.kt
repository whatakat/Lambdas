package com.bankmtk.lambdas.src

fun main(args: Array<String>){
//    var addFive = {x: Int ->x + 5}
//    println("Pass 6 to addFive: ${addFive(6)}")
//
//    val addInts = {x: Int, y: Int -> x+y}
//    val result = addInts.invoke(6,7)
//    println("Pass 6, 7 to addInts: $result")
//
//    val intLambda: (Int, Int)->Int = {x, y -> x*y}
//    println("Pass 10, 11 to intLambda: ${intLambda(10,11)}")
//
//    val addSeven: (Int) ->Int = {it + 7}
//    println("Pass 12 to addSeven: ${addSeven(12)}")
//
//    val myLambda: () ->Unit = { println("Hi!")}
//
//    // fun
//    fun convert(x: Double, convert:(Double) -> Double): Double
//    {
//        var result = convert(x)
//        println("$x is converted to $result")
//        return result
//    }
//    convert(20.0,{c:Double -> c*1.8+32})//a)
//    convert(20.0){c:Double -> c*1.8+32} //b) it`s the same a)
}
typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter:DoubleConversion): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}