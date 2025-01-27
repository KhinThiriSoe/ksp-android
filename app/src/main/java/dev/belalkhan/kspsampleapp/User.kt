package dev.belalkhan.kspsampleapp

import com.khin.kspcore.GenerateToJson

@GenerateToJson
data class User(
    val id: Int,
    val name: String,
)

@GenerateToJson
data class Book(
    val id: Int,
    val name: String,
)

@GenerateToJson
data class Song(
    val id: Int,
    val name: String,
)