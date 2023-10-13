package com.example.drewmetapp.apis

import com.example.drewmetapp.models.GalleryResponse
import com.example.drewmetapp.models.TagsResponse
import com.example.drewmetapp.params.Section
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImgurAPIv3 {

    @GET("gallery/{section}")
    suspend fun getGallery(
        @Path("section") section: Section,
        @Query("albums_previews") albumPreviews: Boolean? = true
    ) : Response<GalleryResponse>

    @GET("tags")
    suspend fun getTags() : Response<TagsResponse>
}