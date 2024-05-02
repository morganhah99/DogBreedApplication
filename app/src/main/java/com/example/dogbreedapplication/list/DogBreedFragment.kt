package com.example.dogbreedapplication.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dogbreedapplication.databinding.FragmentDogBreedBinding

class DogBreedFragment : Fragment() {

    private lateinit var binding: FragmentDogBreedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogBreedBinding.inflate(inflater, container, false)
        val dogBreedViewModel =
            ViewModelProvider(this).get(DogBreedViewModel::class.java)

        binding.apply {
            dogBreedViewModel.dogBreedList.observe(viewLifecycleOwner) { dogBreedModel ->
                val breedList = listOf(dogBreedModel) // Create a list containing only the current DogBreedModel
                rvDogBreeds.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = DogBreedAdapter(breedList)
                }
            }
        }
        return binding.root
    }


}


