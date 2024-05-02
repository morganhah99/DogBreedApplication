package com.example.dogbreedapplication.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dogbreedapplication.R
import com.example.dogbreedapplication.databinding.FragmentDogBreedBinding

class DogBreedFragment : Fragment() {

    private lateinit var binding: FragmentDogBreedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDogBreedBinding.inflate(inflater, container, false)
        return binding.root
    }


}