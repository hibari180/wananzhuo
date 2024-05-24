package com.example.module_base.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetCreate {
    companion object {
        fun getInstance(): NetCreate {
            return SingletonHolder.instance
        }
    }

    private object SingletonHolder {
        val instance = NetCreate()
    }

    val request = Retrofit.Builder().baseUrl(NetConstants.Base_URL).addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create()).build()

}