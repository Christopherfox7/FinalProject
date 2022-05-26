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
    private var index = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuestionareBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val questions = listOf<String>("Do you like topics of Chemistry?","Do you like Environmental Sciences?","Do you like topics of biology?","Do you like topics of physics?",
            "Do you like to work hands on more than studying information?","Do you want to participate in an event that will challenge you with new and unique concepts?","Do you like working a lot with others?")

        binding.backToMenuButton.setOnClickListener {
            rootView.findNavController().navigateUp()
        }

        binding.trueButton.setOnClickListener {
            viewModel.updateQuestion(1)

        }

        binding.falseButton.setOnClickListener {
            viewModel.updateQuestion(-1)

        }
         if(index==7){
            binding.nextQuestionButton.text = "Finish Questionnaire"

        }

            binding.nextQuestionButton.setOnClickListener {
                if(index<7) {
                viewModel.updateQuestionText(questions[index])
                index++

                binding.questionText.text = viewModel.questionText.value
                    if(index==7){
                    binding.nextQuestionButton.text = "Finish Questionnaire"
                    index++
                }
            }
                if(index==8){
                binding.questionText.text = viewModel.eventResults.value
            }


        }

        return rootView
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}