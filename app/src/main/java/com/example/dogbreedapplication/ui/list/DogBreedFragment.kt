package com.example.dogbreedapplication.ui.list

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

        //Observers observe changes in this case, dogBreedList LiveData object in the dogBreedViewModel
        //When the dogBreedList changes, the onChanged lambda function is called.
        //Inside of it, the new dogBreedModel value is received, and a new list is breedList containing
        //the single dogBreedModel is created
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


