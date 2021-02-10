package com.satugenggam.aplikasi1.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserRegisterResponse(
    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("created_at")
    val createdAt: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("toko_id")
    val tokoId: String? = null
): Parcelable
