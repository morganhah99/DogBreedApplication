package com.example.dogbreedapplication.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dogbreedapplication.R
import com.example.dogbreedapplication.data.model.MessageModel
import com.example.dogbreedapplication.databinding.ItemDogBreedBinding


//The Adapter acts as a bridge between a data source and the RecyclerView.
//The RecyclerView provides the necessary methods to bind data to views
//that are displayed within the RecyclerView
class DogBreedAdapter(
    val breedList: List<MessageModel>
) : Adapter<DogBreedAdapter.DogBreedViewHolder>() {


    //Represents a single item view in the RecyclerView
    //Holds a reference to the layout binding for the item view
    inner class DogBreedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemDogBreedBinding.bind(itemView)

        //updateUI method is used to update the view from
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