package com.northside_shawty.data.network.models.accounts

import com.google.gson.annotations.SerializedName

data class UserRequestData(
    @SerializedName("first_name")
    val firstName : String,
    @SerializedName("last_name")
    val lastName : String,
    @SerializedName("phone")
    val phone : String,
    @SerializedName("email")
    val email : String,
    @SerializedName("password")
    val password : String
)
