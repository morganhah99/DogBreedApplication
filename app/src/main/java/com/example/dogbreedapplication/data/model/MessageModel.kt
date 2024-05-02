package com.example.dogbreedapplication.data.model


import com.google.gson.annotations.SerializedName

data class MessageModel(
    @SerializedName("message")
    val breeds: Map<String, List<String>>? = null
)

