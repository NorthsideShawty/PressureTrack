package com.northside_shawty.data.network.models.accounts

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

data class CreatePatientResponseData @Inject constructor(
    @SerializedName("user")
    val user: UserResponseData,
    @SerializedName("doctor")
    val doctor: String,
    @SerializedName("age")
    val age: Int,
    @SerializedName("height")
    val height: Double,
    @SerializedName("weight")
    val weight: Double,
    @SerializedName("device")
    val device: String
)
