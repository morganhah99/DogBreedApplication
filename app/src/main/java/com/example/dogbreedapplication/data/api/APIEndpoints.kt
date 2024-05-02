package com.example.dogbreedapplication.data.api

import com.example.dogbreedapplication.data.model.DogBreedModel
import retrofit2.http.GET

interface APIEndpoints {

    @GET(APIDetail.DOG_FACT_ENDPOINT)
    suspend fun getDogBreeds(): List<DogBreedModel>

}