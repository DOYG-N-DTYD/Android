package com.example.drewmetapp

import com.example.drewmetapp.apis.ImgurAPIv3
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ImgurClient {
    const val API_KEY = "16abb74c6e5c7e8" // TODO

    private val HttpClient : OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor{
                val request = it.request().newBuilder()
                    .addHeader("Authorization","Client-ID $API_KEY")
                    .build()
                it.proceed(request)
            }.build()
    }

    private val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .client(HttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .addConverterFactory(EnumConverterFactory())
            .baseUrl("https://api.imgur.com/3/")
            .build()
    }
    //private val api = retrofit.create(ImgurAPIv3::class.java)
    val api: ImgurAPIv3 by lazy {
        retrofit.create(ImgurAPIv3::class.java)
    }
}