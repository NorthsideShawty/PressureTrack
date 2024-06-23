package com.northside_shawty.data.network.models.accounts

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

data class LoginResponseData @Inject constructor(
    @SerializedName("auth_token")
    val token: String? = null,

    @SerializedName("user_role")
    val userRole: String? = null
)
