package com.example.testingrecycle

import retrofit2.Call
import retrofit2.http.GET

public interface APIService {
    @GET("entries")
     fun getApiList(): Call<ApisResult>
}