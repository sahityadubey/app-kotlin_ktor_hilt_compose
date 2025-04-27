package com.sahitya.ktorsupportingapp.data

import retrofit2.http.GET

interface RabbitsApi {

    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {
        const val BASE_URL = "http://10.238.125.76:9090"
    }
}