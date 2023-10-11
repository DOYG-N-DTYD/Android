package com.example.libdrew.apis

import com.example.libdrew.services.GalleryResponse
import com.example.libdrew.services.TagsResponse
import retrofit2.Call
import retrofit2.http.GET
interface drewAPI {
    @GET("gallery/hot?=album_previews=true")
    fun getGallery() : Call<GalleryResponse>

    @GET("tags")
    fun getTags() : Call<TagsResponse>
}