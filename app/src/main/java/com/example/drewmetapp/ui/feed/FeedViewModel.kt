package com.example.drewmetapp.ui.feed

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.drewmetapp.data.ImgurRepository
import com.example.drewmetapp.models.GalleryResponse
import com.example.drewmetapp.models.Image
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher

class FeedViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val repo = ImgurRepository()
    private val _feed = MutableLiveData<List<GalleryResponse.Data>>() //TODO List<Image>?

    val feed : LiveData<List<GalleryResponse.Data>> = _feed //TODO List<Image>?

    fun updateFeed(feedType : String){
        viewModelScope.launch (Dispatchers.IO){
            when(feedType){
                "hot" -> _feed.postValue(repo.getHotFeed())
                "top" -> _feed.postValue(repo.getTopFeed())
                else -> Log.e("FEED","TEST FeedViewModel")
            }
        }
    }
}