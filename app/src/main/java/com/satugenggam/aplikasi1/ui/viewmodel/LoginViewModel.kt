package com.satugenggam.aplikasi1.ui.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satugenggam.aplikasi1.LoginActivity
import com.satugenggam.aplikasi1.data.api.RetrofitBuilder
import com.satugenggam.aplikasi1.data.model.LoginResponse
import com.satugenggam.aplikasi1.data.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel: ViewModel(){


    private val loginData = MutableLiveData<LoginResponse>()

    fun getLoginData(): LiveData<LoginResponse>{
        return loginData
    }

    fun setLoginData(email: String, password: String, tokoId: String){
        val apiLogin: Call<LoginResponse?> = RetrofitBuilder.apiService.loginResponse(email, password, tokoId)

        apiLogin.enqueue(object: Callback<LoginResponse?>{
            override fun onResponse(
                call: Call<LoginResponse?>,
                response: Response<LoginResponse?>
            ) {
                if (response.isSuccessful && response.body() != null){
                    val loginResponse = response.body() as LoginResponse
                    //Look the token login at logcat and choose debug, and type Login Response there to see it
                    Log.d("Login Response", loginResponse.accessToken.toString())
                } else {
                    Log.d("Login Response", "Login Failed")
                }
            }

            override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
                Log.d("Login Failure", "" +t.localizedMessage)
            }
        })
    }
}