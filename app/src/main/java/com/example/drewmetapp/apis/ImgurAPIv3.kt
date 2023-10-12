package com.example.drewmetapp.apis

import com.example.drewmetapp.models.GalleryResponse
import com.example.drewmetapp.models.GalleryTagsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ImgurAPIv3 {

    @GET("gallery/hot?album_peviews=true")
    fun getGalery() : Call<GalleryResponse>

    @GET("tags")
    fun getTags() : Call<GalleryTagsResponse>
}