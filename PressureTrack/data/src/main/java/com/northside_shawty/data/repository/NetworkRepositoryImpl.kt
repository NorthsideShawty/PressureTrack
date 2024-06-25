package com.northside_shawty.data.repository

import com.northside_shawty.data.network.api.IRetrofitAPI
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val retrofitApi : IRetrofitAPI
) : INetworkRepository {

}