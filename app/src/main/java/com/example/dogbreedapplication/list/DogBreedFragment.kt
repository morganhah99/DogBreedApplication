package com.example.dogbreedapplication.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dogbreedapplication.R
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



        // Inflate the layout for this fragment

        return binding.root
    }


}