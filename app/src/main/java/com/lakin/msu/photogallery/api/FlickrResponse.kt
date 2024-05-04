package com.lakin.msu.photogallery.api

import com.squareup.moshi.JsonClass

private const val TAG = "FlickrResponse"


@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)