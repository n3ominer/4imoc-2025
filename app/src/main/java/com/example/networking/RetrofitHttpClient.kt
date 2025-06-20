package com.example.networking

import com.google.gson.GsonBuilder
import retrofit2.Retrofit


object RetrofitHttpClient {
    private const val BASE_URL = "https://my-json-server.typicode.com/"

    val instance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory()
            .build()
    }
}