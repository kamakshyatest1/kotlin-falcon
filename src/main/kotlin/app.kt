package com.endor

fun main() {

    val string = readLine()
    val result = string?.let { Anagrams().count(it) }

    println(result)
}

