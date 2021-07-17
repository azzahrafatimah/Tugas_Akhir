package com.fatimah.quiz15.model

import com.google.gson.annotations.SerializedName

data class IndonesiaResponse(
        @SerializedName(value = "meninggal")
        val meninggal: String,

        @SerializedName(value = "name")
        val name: String,

        @SerializedName(value = "positif")
        val positif: String,

        @SerializedName(value = "sembuh")
        val sembuh: String
)