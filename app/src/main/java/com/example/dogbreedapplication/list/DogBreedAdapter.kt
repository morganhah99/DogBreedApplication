package com.example.dogbreedapplication.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dogbreedapplication.R
import com.example.dogbreedapplication.data.model.DogBreedModel
import com.example.dogbreedapplication.databinding.ItemDogBreedBinding

class DogBreedAdapter(
    val breedList: List<DogBreedModel>
) : Adapter<DogBreedAdapter.DogBreedViewHolder>() {

    inner class DogBreedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemDogBreedBinding.bind(itemView)

        fun updateUI(dogBreedModel: DogBreedModel) {
            binding.apply {
                val itemBreed = dogBreedModel.message?.breeds?.keys?.firstOrNull() ?: ""
                tvDogBreed.text = itemBreed
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogBreedViewHolder {
        return DogBreedViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_dog_breed, parent, false)
        )
    }

    override fun getItemCount() = breedList.size

    override fun onBindViewHolder(holder: DogBreedViewHolder, position: Int) {
        holder.updateUI(breedList[position])
//        holder.binding.root.setOnClickListener{
//            function.invoke(breedList[position])
//        }
    }
}