package com.example.repositories

import android.util.Log
import com.example.data.dto.ConversationDto
import com.example.data.models.messages.ConversationModel
import com.example.networking.RetrofitHttpClient
import com.example.networking.services.ConversationService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ConversationRepository {
    // - Instanciation d'une classe pas Retrofit qui implémente l'interface "ConversationService"
    // - Implementation concrète de la fonction "getAllConversations" dans l'interface
    private val conversationService = RetrofitHttpClient.instance.create<ConversationService>(ConversationService::class.java)

    fun fetchAllConversations() {
        val call = conversationService.getAllConversations()

        call.enqueue(object: Callback<List<ConversationDto>> {
            override fun onResponse(
                call: Call<List<ConversationDto>?>,
                response: Response<List<ConversationDto>?>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { conversations ->
                        conver
                    }
                } else {

                }
            }

            override fun onFailure(
                call: Call<List<ConversationDto>?>,
                t: Throwable
            ) {
                Log.d("fetchAllConversations - error", "Could not fetch all conversation from API")
            }
        })

    }
}