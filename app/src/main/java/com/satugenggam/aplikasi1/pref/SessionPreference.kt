package com.satugenggam.aplikasi1.pref

import android.content.Context
import com.satugenggam.aplikasi1.data.model.LoginResponse
import com.satugenggam.aplikasi1.data.model.UserLoginResponse

internal class SessionPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "prefs_name"
        private const val ID = "id"
        private const val TOKEN = "token"
        private const val TOKEN_TYPE = "token_type"
        private const val EXPIRES_IN = "expires_in"
        private const val NAME = "name"
        private const val EMAIL = "email"
        private const val ACTIVE_STATUS = "active_status"
        private const val TOKO_ID = "toko_id"
        private const val TYPE = "type"
    }

    private val sessionPreference = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setSession(value: LoginResponse){
        val editor = sessionPreference.edit()
        editor.putInt(ID, value.userLoginResponse?.id!!)
        editor.putString(TOKEN, value.accessToken)
        editor.putString(TOKEN_TYPE, value.tokenType)
        editor.putInt(EXPIRES_IN, value.expiresIn!!)
        editor.putString(NAME, value.userLoginResponse.name)
        editor.putString(EMAIL, value.userLoginResponse.email)
        editor.putString(ACTIVE_STATUS, value.userLoginResponse.activeStatus)
        editor.putString(TOKO_ID, value.userLoginResponse.tokoId)
        editor.putString(TYPE, value.userLoginResponse.tipe)
        editor.apply()
    }

    fun getUserSession(): LoginResponse{
        val loginResponseModel = LoginResponse()
        loginResponseModel.userLoginResponse?.id = sessionPreference.getInt(ID, 0)
        loginResponseModel.accessToken = sessionPreference.getString(TOKEN, "")
        loginResponseModel.tokenType = sessionPreference.getString(TOKEN_TYPE, "")
        loginResponseModel.expiresIn = sessionPreference.getInt(EXPIRES_IN, 0)
        loginResponseModel.userLoginResponse?.name = sessionPreference.getString(NAME, "")
        loginResponseModel.userLoginResponse?.email = sessionPreference.getString(EMAIL, "")
        loginResponseModel.userLoginResponse?.activeStatus = sessionPreference.getString(ACTIVE_STATUS, "")
        loginResponseModel.userLoginResponse?.tokoId = sessionPreference.getString(TOKO_ID,"")
        loginResponseModel.userLoginResponse?.tipe = sessionPreference.getString(TYPE, "")
        return loginResponseModel
    }
}