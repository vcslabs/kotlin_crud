package com.example.kotlin_tips.infrastructure.repositories

import com.example.kotlin_tips.domain.repositories.DemoRepository
import org.springframework.stereotype.Repository

@Repository
class DemoRepositoryImpl: DemoRepository {

    override fun hello(): String {

        return "hello kotlin"
    }
}
