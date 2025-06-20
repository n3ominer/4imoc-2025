package com.example.data.models.messages

data class ConversationModelItem(
    val messages: List<Message>,
    val username: String,
    val timeStamp: String,
    val key: String
)