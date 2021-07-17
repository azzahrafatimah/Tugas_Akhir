package com.fatimah.quiz15.retrofit


import com.fatimah.quiz15.model.IndonesiaResponse
import com.fatimah.quiz15.model.ProvinsiResponse
import retrofit2.Call
import retrofit2.http.GET
import java.util.*


interface CoronaEndPoint {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET(value = "indonesia/provinsi")
    fun getProvinsi(): Call<ArrayList<ProvinsiResponse>>
}