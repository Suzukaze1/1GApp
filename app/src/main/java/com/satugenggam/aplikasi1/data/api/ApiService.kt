package com.satugenggam.aplikasi1.data.api

import com.satugenggam.aplikasi1.data.model.LoginResponse
import com.satugenggam.aplikasi1.data.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("auth/login")
    fun loginResponse(
            @Field("email") email: String,
            @Field("password") password: String,
            @Field("toko_id") tokoId: String
        ): Call<LoginResponse?>

    @FormUrlEncoded
    @POST("auth/register")
    fun registerResponse(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("password_confirmation") password_confirmation: String,
    ): Call<RegisterResponse?>

}