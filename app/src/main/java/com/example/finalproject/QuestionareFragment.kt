package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentQuestionareBinding


class QuestionareFragment : Fragment() {
    private var _binding: FragmentQuestionareBinding? = null
    private val binding get() = _binding!!
    private val viewModel: QuestionareViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuestionareBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val questions = listOf<String>("Do you like topics of Chemistry?","Do you like Environmental Sciences?","Do you like topics of physics?","Do you like to work hands on more than studying information?","Do you like topics of biology?","Do you want to participate in an event that will challenge you with new and unique concepts?")

        binding.backToMenuButton.setOnClickListener {
            rootView.findNavController().navigateUp()
        }



        return rootView
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}