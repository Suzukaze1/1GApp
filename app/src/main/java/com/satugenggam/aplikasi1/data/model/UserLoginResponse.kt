package com.satugenggam.aplikasi1.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserLoginResponse(

    @field:SerializedName("created_at")
    val createdAt: String? = null,

    @field:SerializedName("email_verified_at")
    val emailVerifiedAt: String? = null,

    @field:SerializedName("current_team_id")
    val currentTeamId: Int? = null,

    @field:SerializedName("avatar")
    val avatar: String? = null,

    @field:SerializedName("toko_id")
    var tokoId: String? = null,

    @field:SerializedName("active_status")
    var activeStatus: String? = null,

    @field:SerializedName("dark_mode")
    val darkMode: String? = null,

    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("provider")
    val provider: String? = null,

    @field:SerializedName("two_factor_recovery_codes")
    val twoFactorRecoveryCodes: String? = null,

    @field:SerializedName("name")
    var name: String? = null,

    @field:SerializedName("provider_id")
    val providerId: Int? = null,

    @field:SerializedName("id")
    var id: Int? = null,

    @field:SerializedName("profile_photo_path")
    val profilePhotoPath: String? = null,

    @field:SerializedName("two_factor_secret")
    val twoFactorSecret: String? = null,

    @field:SerializedName("tipe")
    var tipe: String? = null,

    @field:SerializedName("email")
    var email: String? = null,

    @field:SerializedName("messenger_color")
    val messengerColor: String? = null
) : Parcelable

