package com.example.viemodels

import androidx.lifecycle.ViewModel
import com.example.data.models.messages.ConversationModelItem
import com.example.repositories.ConversationRepository

class ConversationViewModel: ViewModel() {
    // Private data to hold
    private val _conversations: MutableList<ConversationModelItem> = mutableListOf()

    // Exposed data / Impossible to edit
    val conversations: List<ConversationModelItem>
        get() = _conversations


    private var conversationRepository: ConversationRepository = ConversationRepository()

    init {
        conversationRepository.fetchAllConversations()
    }

    fun removeMessage() {
        _conversations.removeAt(1)
    }

    fun editMessage() {
        // Modifier le state
    }
}