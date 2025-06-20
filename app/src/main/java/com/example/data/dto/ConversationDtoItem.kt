package com.example.data.dto

import com.google.gson.annotations.SerializedName

data class ConversationDtoItem(
    @SerializedName("messages")
    val messageDtos: List<MessageDto>,
    val username: String
)