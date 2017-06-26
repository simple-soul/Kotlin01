package com.example.kotlin01

import com.example.kotlin01.annotations.Bean
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

/**
 * Created by simple_soul on 2017/6/12.
 */
fun main(args: Array<String>)
{
    var array : Array<String> = arrayOf("dsd", "fs")
    var list : ArrayList<String> = arrayListOf("fsaf")
    var map = hashMapOf<Int, String>()

    map.put(1, "11")
    map.forEach(::println)
    println()

    array+="33333"
    array.forEach(::print)
    println("\n")

    list.add("123")
    for ((index, value) in list.withIndex())
    {
        println("$index->$value")
    }

    println()
    var bean = bean("bean", 34)
    println("name=${bean.name}, age=${bean.age}")
    println("name=${bean.component1()}, age=${bean.component2()}")
    val (na, ag) = bean
    println("name=$na, age=$ag")

//    println("Hello World!")
//    println(sum(1,2))
//    println(mu(1,2))
//    println()
//    args.forEach { item->println(item) }
//    args.forEach { println(it) }
//    args.forEach ( ::println )
//
//    var clazz = clazz(1, "faf")
//    val arg1 = clazz.arg1
//    clazz.arg1
//
//    clazz = when(args[0])
//    {
//        str -> clazz(1, "d")
//        else -> clazz(2,"")
//    }
//
//    for (i in 1..3){println(i)}

}

var sum = {a:Int, b:Int-> a+b}

var mu = fun (a:Int, b:Int):Int
{
    return a*b
}

class clazz(arg1:Int, arg2:String)
{
    val x:Int = 2
    var y:String = "gfsg"
    var arg1 = arg1
    var arg2 = arg2
    get()
    {
        return field
    }
    set(value)
    {
        field = value
    }
}

@Bean
data class bean(val name: String, val age : Int)