package com.example.drewmetapp

import com.example.drewmetapp.apis.ImgurAPIv3
import com.example.drewmetapp.params.Section
import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ImgurAPIv3Tests {
//    private val client = OkHttpClient.Builder()
//    .addInterceptor{
//        val request = it.request().newBuilder()
//            .addHeader("Authorization","Client-ID 16abb74c6e5c7e8")
//            .build()
//        it.proceed(request)
//    }.build()
//
//    private val retrofit = Retrofit.Builder()
//        .client(client)
//        .addConverterFactory(MoshiConverterFactory.create())
//        .baseUrl("https://api.imgur.com/3/")
//        .build()
//    private val api = retrofit.create(ImgurAPIv3::class.java)
    val api = ImgurClient.api;

    // TODO: runBlocking {} ?

    @Test
    fun `get tags working`() = runBlocking{
        val response = api.getTags()
        //println(response.raw().toString())
        assertNotNull(response.body())
    }
    @Test
    fun `get galleries hot working`() = runBlocking{
        val response = api.getGallery(Section.HOT)
        assertNotNull(response.body())
    }
    @Test
    fun `get galleries top working`() = runBlocking{
        val response = api.getGallery(Section.TOP)
        assertNotNull(response.body())
    }
}