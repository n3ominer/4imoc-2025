package com.example.utils

import com.example.data.dto.ConversationDto
import com.example.data.dto.ConversationDtoItem
import com.example.data.dto.MessageDto
import com.example.data.models.messages.ConversationModel
import com.example.data.models.messages.ConversationModelItem
import com.example.data.models.messages.Message


fun ConversationDto.toModel(): List<ConversationModelItem> {
    return this.map { dto ->
        ConversationModelItem(
            username = dto.username,
            messages = dto.messageDtos.map { messageDto ->
                Message(
                    isMe = messageDto.isMe,
                    text = messageDto.text,
                )
            },
            timeStamp = "",
            key = ""
        )
    }
}

fun ConversationModel.toDto(): List<ConversationDtoItem> {
    return this.map { model ->
        ConversationDtoItem(
            username = model.username,
            messageDtos = model.messages.map { messageModel ->
                MessageDto(
                    isMe = messageModel.isMe,
                    text = messageModel.text
                )
            }
        )

    }
}