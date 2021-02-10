package com.satugenggam.aplikasi1.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(

	@field:SerializedName("access_token")
	var accessToken: String? = null,

	@field:SerializedName("token_type")
	var tokenType: String? = null,

	@field:SerializedName("expires_in")
	var expiresIn: Int? = null,

	@field:SerializedName("user")
	val userLoginResponse: UserLoginResponse? = null
) : Parcelable
