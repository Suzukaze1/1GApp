package com.satugenggam.aplikasi1.data.api

import com.satugenggam.aplikasi1.data.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("auth/login")
    fun loginResponse(
            @Field("email") username: String,
            @Field("password") password: String,
            @Field("toko_id") tokoId: String
        ): Call<LoginResponse?>

}