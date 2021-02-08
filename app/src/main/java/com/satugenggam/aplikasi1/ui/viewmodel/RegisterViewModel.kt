package com.satugenggam.aplikasi1.ui.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satugenggam.aplikasi1.data.api.RetrofitBuilder
import com.satugenggam.aplikasi1.data.model.RegisterResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterViewModel: ViewModel() {
    private val registerResponse = MutableLiveData<RegisterResponse>()

    fun getRegisterResponse(): LiveData<RegisterResponse>{
        return registerResponse
    }

    fun setRegisterResponse(
        name: String,
        email: String,
        password: String,
        password_confirmation: String,
        context: Context
    ){
        val apiRegister: Call<RegisterResponse?> = RetrofitBuilder.apiService.registerResponse(
            name,
            email,
            password,
            password_confirmation
        )
        apiRegister.enqueue(object : Callback<RegisterResponse?> {
            override fun onResponse(
                call: Call<RegisterResponse?>,
                response: Response<RegisterResponse?>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    val registerResponse = response.body() as RegisterResponse
                    Log.d("Register Response", registerResponse.message.toString())
                    Toast.makeText(
                        context,
                        "Register berhasil",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        context,
                        "Register tidak berhasil",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<RegisterResponse?>, t: Throwable) {
                Log.d("Login Failure", "" +t.localizedMessage)
            }

        })
    }
}