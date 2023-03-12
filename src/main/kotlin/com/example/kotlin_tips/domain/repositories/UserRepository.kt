package com.example.kotlin_tips.domain.repositories

import com.example.kotlin_tips.infrastructure.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<UserEntity, Int> {

    fun save(userEntity: UserEntity): UserEntity

    override fun findById(id: Int): Optional<UserEntity>
}