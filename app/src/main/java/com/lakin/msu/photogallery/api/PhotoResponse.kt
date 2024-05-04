package com.lakin.msu.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

private const val TAG = "PhotoResponse"


@JsonClass(generateAdapter = true)
data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)