package com.example.kotlin_tips

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTipsApplication

fun main(args: Array<String>) {
    runApplication<KotlinTipsApplication>(*args)
    println("kotlin start")
}
