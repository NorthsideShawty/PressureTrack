package com.northside_shawty.pressuretrack.di

import com.northside_shawty.data.Constants
import com.northside_shawty.data.network.api.IRetrofitAPI
import com.northside_shawty.data.repository.NetworkRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    // Network DI
    @Provides
    fun provideBaseUrl() = Constants.HTTP_URL

    @Provides
    @Singleton
    fun provideRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(provideBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitApi(retrofit: Retrofit): IRetrofitAPI {
        return retrofit.create(IRetrofitAPI::class.java)
    }

    @Provides
    fun provideNetworkRepository(retrofitApi: IRetrofitAPI) : NetworkRepositoryImpl {
        return NetworkRepositoryImpl(retrofitApi)
    }
}