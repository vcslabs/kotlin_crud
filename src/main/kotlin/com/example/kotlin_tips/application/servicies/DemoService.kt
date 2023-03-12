package com.example.kotlin_tips.application.servicies

import com.example.kotlin_tips.domain.repositories.DemoRepository
import com.example.kotlin_tips.domain.repositories.UserRepository
import com.example.kotlin_tips.infrastructure.entities.UserEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class DemoService(
    private val demoRepository: DemoRepository,
    private val userRepository: UserRepository
) {

    fun hello(): String {
        return demoRepository.hello()
    }

    fun createUser(userEntity: UserEntity): UserEntity {
        return userRepository.save(userEntity)
    }

    fun deleteUser(id: Int) {
        try {
            return userRepository.deleteById(id)
        } catch(e: Exception) {
            throw IllegalArgumentException("削除対象が見つかりません", e)
        }
    }

    fun findUser(id: Int): Optional<UserEntity> {
        return userRepository.findById(id)
    }

    fun findUsers(): List<UserEntity> {
        return userRepository.findAll()
    }
}