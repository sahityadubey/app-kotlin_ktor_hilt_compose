package com.sahitya.ktorsupportingapp.di

import com.sahitya.ktorsupportingapp.data.RabbitsApi
import com.sahitya.ktorsupportingapp.data.RabbitsApi.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRabbitApi(): RabbitsApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RabbitsApi::class.java)
    }
}