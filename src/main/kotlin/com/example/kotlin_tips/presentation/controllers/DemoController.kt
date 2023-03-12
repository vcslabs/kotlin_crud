package com.example.kotlin_tips.presentation.controllers

import com.example.kotlin_tips.application.servicies.DemoService
import com.example.kotlin_tips.infrastructure.entities.UserEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.Optional
import kotlin.jvm.Throws

@RestController
class DemoController(private val demoService: DemoService) {

    @GetMapping("/hello")
    fun hello(): String {
        return demoService.hello()
    }

    @PostMapping("/users")
    fun createUser(@RequestBody userEntity: UserEntity): UserEntity {
        return demoService.createUser(userEntity)
    }

    @Throws(IllegalArgumentException::class)
    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable id: Int) {
        return demoService.deleteUser(id)
    }

    @GetMapping("/users/{id}")
    fun findUser(@PathVariable id: Int): Optional<UserEntity> {
        return demoService.findUser(id)
    }

    @GetMapping("/users")
    fun findUsers(): List<UserEntity> {
        return demoService.findUsers()
    }
}
