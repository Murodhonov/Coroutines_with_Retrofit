package uz.umarxon.coroutineswithretrofit.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.umarxon.coroutineswithretrofit.modles.Album

interface ApiService {

    @GET("/albums")
    fun getAlbums(): Call<List<Album>>
}