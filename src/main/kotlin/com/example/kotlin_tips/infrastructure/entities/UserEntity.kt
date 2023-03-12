package com.example.kotlin_tips.infrastructure.entities

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,

    @Column(length = 100, nullable = false)
    val name: String
) {}
