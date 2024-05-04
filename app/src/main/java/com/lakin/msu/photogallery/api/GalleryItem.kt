package com.lakin.msu.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

private const val TAG = "GalleryItem"


@JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    val id: String,
    @Json(name = "url_s") val url: String,
)