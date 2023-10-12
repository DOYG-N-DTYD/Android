package com.example.drewmetapp.apis

import com.example.drewmetapp.models.GalleryResponse
import com.example.drewmetapp.models.GalleryTagsResponse
import com.example.drewmetapp.params.Section
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImgurAPIv3 {

    @GET("gallery/{section}")
    fun getGallery(
        @Path("section") section: Section,
        @Query("albums_previews") albumPreviews: Boolean? = true
    ) : Call<GalleryResponse>

    @GET("tags")
    fun getTags() : Call<GalleryTagsResponse>
}