package com.example.dogbreedapplication.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogbreedapplication.data.api.RetrofitInstance
import com.example.dogbreedapplication.data.model.DogBreedModel
import kotlinx.coroutines.launch

class DogBreedViewModel : ViewModel() {

    private val _dogBreedList = MutableLiveData<DogBreedModel>()
    val dogBreedList: LiveData<DogBreedModel> = _dogBreedList

    init {
        getDogBreeds()
    }

    fun getDogBreeds() {
        viewModelScope.launch {

            val result = RetrofitInstance.apiClient.getDogBreeds()

            val message = result.message

            if (message?.breeds != null) {
                Log.d("DogBreedViewModel", "Dog breeds loaded successfully")
                _dogBreedList.postValue(result)
            }

        }
    }
}