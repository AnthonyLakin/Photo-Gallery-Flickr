package com.lakin.msu.photogallery

import com.lakin.msu.photogallery.api.FlickrApi
import com.lakin.msu.photogallery.api.GalleryItem
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import android.util.Log


private const val TAG = "PhotoRepository"

class PhotoRepository {
    private val flickrApi: FlickrApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.flickr.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        flickrApi = retrofit.create()
        Log.d(TAG, "Retrofit has been configured with base URL: https://api.flickr.com/")

    }

    suspend fun fetchPhotos(): List<GalleryItem> =
        flickrApi.fetchPhotos().photos.galleryItems
}