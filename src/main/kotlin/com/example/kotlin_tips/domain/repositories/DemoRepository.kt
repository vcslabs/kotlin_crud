package com.example.kotlin_tips.domain.repositories

import org.springframework.stereotype.Repository

@Repository
interface DemoRepository {

    fun hello(): String
}
