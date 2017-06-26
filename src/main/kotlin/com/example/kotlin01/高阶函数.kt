package com.example.kotlin01

import sun.security.krb5.internal.KDCOptions.with

/**
 * Created by simple_soul on 2017/6/26.
 */

fun main(args: Array<String>)
{
    val list1 = listOf(1..34, 4..7)
    var list2 = listOf(2,4,6,23,87)

    //forEach(遍历，无返回值)
//    list2.forEach{it*2}
//    list2.forEach { print("$it ") }
//    list1.forEach {it.forEach { print("$it ") }}

    //map(遍历，返回list)
//    val newList = (1..30).map { it * 2 + 3 }
//    newList.forEach(::println)

    //flatMap(将多重集合平铺，返回list)
//    val newList2 = list1.flatMap { it }
//    newList2.forEach(::println)

    //reduce(遍历并对每一项进行操作，并将值赋给acc进行累计，函数返回值为acc)
//    val newList3 = list2.reduce { acc, i -> i+acc }
//    println(newList3)
//    println(list2)
//    (0..6).map(::factorial).forEach(::println)

    //fold(有初始值的reduce，还可以进行字符串操作等)
//    println(list2.fold(5){acc, i -> i+acc })
//    println(list2.fold(StringBuffer()){acc, i -> acc.append("$i,") })
//
//    println((1..12).joinToString(","))

    //filter(lambda表达式返回为false时过滤)
//    println(list2.filter { it%2==1 })

    //takeWhile(lambda表达式返回false时结束)
//    println(list2.takeWhile { it%2==0 })

    //let(默认当前对象为it，返回值为最后一行)
    println(list2.let {
        it.toString()
        it[1]
    })

    //apply(在函数内可以直接调用该对象的方法，返回该对象)
    println(list2.apply{
        toString()
        get(1)
    })

    //run(在函数内可以直接调用该对象的方法，返回最后一行)
    println(list2.run {
        toString()
        get(1)
    })

    //以上三个方法可以简化非空判断(不为空就执行)
    list2?.apply { get(1) }

    //with(在函数内可以直接调用该对象的方法，返回最后一行。此函数为单独函数，需要传值)
    println(with(list2)
            {
                toString()
                get(1)
            })

}

//阶乘
fun factorial(n: Int): Int
{
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}