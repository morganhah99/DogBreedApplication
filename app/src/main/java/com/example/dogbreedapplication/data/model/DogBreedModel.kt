package com.example.dogbreedapplication.data.model


import com.google.gson.annotations.SerializedName

data class DogBreedModel(
    @SerializedName("message")
    val message: MessageModel? = MessageModel(),
    @SerializedName("status")
    val status: String? = ""
)