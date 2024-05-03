package com.example.dogbreedapplication.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dogbreedapplication.databinding.FragmentDogBreedBinding


//The fragment represents a portion of user interface or behavior within an activity
//The fragments are commonly used to host the RecyclerView and manage its interaction
//with the rest of the app. Fragments contain the RecyclerView and its adapter
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
                val breedList = listOf(dogBreedModel)
                rvDogBreeds.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = DogBreedAdapter(breedList)
                }
            }
        }
        return binding.root
    }


}


