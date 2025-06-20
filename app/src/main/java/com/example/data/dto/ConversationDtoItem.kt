package com.example.data.dto

data class ConversationDtoItem(
    val messageDtos: List<MessageDto>,
    val username: String
)