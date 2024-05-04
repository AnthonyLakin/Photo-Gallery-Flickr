package com.lakin.msu.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "efddfa3a3ded20ecb89324f40107d221"
private const val TAG = "FlickrApi"


interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}