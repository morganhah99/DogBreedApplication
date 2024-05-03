package com.example.dogbreedapplication.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dogbreedapplication.R
import com.example.dogbreedapplication.data.model.MessageModel
import com.example.dogbreedapplication.databinding.ItemDogBreedBinding

class DogBreedAdapter(
    val breedList: List<MessageModel>
) : Adapter<DogBreedAdapter.DogBreedViewHolder>() {

    inner class DogBreedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemDogBreedBinding.bind(itemView)

        fun updateUI(messageModel: MessageModel) {
            val breedsString = messageModel.breeds?.keys?.joinToString(separator = ", ") ?: ""
            binding.tvDogBreed.text = breedsString
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogBreedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dog_breed, parent, false)
        return DogBreedViewHolder(view)
    }

    override fun getItemCount() = breedList.size

    override fun onBindViewHolder(holder: DogBreedViewHolder, position: Int) {
        holder.updateUI(breedList[position])
    }
}