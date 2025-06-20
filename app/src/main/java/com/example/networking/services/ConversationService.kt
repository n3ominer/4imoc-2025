package com.example.networking.services

import com.example.data.dto.ConversationDto
import retrofit2.Call
import retrofit2.http.GET

interface ConversationService {

    @GET("RamzyK/demo/conversations")
    fun getAllConversations(): Call<ConversationDto>
}