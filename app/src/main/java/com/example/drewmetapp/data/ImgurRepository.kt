package com.example.drewmetapp.data

import com.example.drewmetapp.ImgurClient
import com.example.drewmetapp.models.GalleryResponse
import com.example.drewmetapp.params.Section
import com.example.drewmetapp.models.Image
class ImgurRepository {
    val api = ImgurClient.api
    suspend fun getHotFeed(): List<GalleryResponse.Data>? {//List<Image>?{ // TODO: Return proper error object if null
        val response = api.getGallery(Section.HOT)
        return response.body()?.data
    }

    suspend fun getTopFeed(): List<GalleryResponse.Data>? {//List<Image>?{ // TODO
        val response = api.getGallery(Section.TOP)
        return response.body()?.data
    }
}