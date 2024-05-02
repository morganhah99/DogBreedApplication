package com.example.dogbreedapplication.list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dogbreedapplication.data.model.DogBreedModel
import com.example.dogbreedapplication.databinding.ItemDogBreedBinding

class DogBreedAdapter(
    val breedList: List<DogBreedModel>
) : Adapter<DogBreedAdapter.DogBreedViewHolder>() {

    inner class DogBreedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemDogBreedBinding.bind(itemView)

        fun updateUI(dogBreedModel: DogBreedModel) {
            binding.apply {
                val item_breed = dogBreedModel.message?.breeds?.keys?.firstOrNull() ?: ""
                tvDogBreed.text = "Breed: $item_breed"
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogBreedViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DogBreedViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}