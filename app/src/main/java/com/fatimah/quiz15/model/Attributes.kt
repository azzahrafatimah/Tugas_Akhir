package com.fatimah.quiz15.model

import com.google.gson.annotations.SerializedName

data class Attributes(
        @SerializedName(value = "FID")
        val FID: Int,

        @SerializedName(value = "Kasus_Meni")
        val meninggal: Int,

        @SerializedName(value = "Kasus_Posi")
        val positif: Int,

        @SerializedName(value = "Kasus_Semb")
        val sembuh: Int,

        @SerializedName(value = "Kode_Provi")
        val kode: Int,

        @SerializedName(value = "Provinsi")
        val provinsi: String
)