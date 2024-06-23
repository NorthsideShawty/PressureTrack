package com.northside_shawty.data.network.models.accounts

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

data class LoginRequestData @Inject constructor(
    @SerializedName("email")
    val email : String,
    @SerializedName("password")
    val password : String
)
