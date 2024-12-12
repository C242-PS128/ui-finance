package com.example.myapplication.data.retrofit
import com.example.myapplication.data.response.SignUpResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("signup")
    fun createAccount(
        @Body requestBody: Map<String, String>
    ): Call<SignUpResponse>
}