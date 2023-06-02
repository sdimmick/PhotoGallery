package com.bignerdranch.android.photogallery.api

import com.bignerdranch.android.photogallery.model.FlickrResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=871b5cce3065b3ec353cc3071095b790" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchBytes(@Url url: String): Call<ResponseBody>
}