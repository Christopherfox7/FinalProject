package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentQuestionareBinding


class QuestionareFragment : Fragment() {
    private var _binding: FragmentQuestionareBinding? = null
    private val binding get() = _binding!!
    private val viewModel: QuestionareViewModel by viewModels()
    private var index = 1

    private var num = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuestionareBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.questionText.text = "Do you like topics of Chemistry?"
        index = 1

        binding.questionare.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_slide_in_bottom))


        val questions = listOf<String>("Do you like topics of Chemistry?","Do you like Environmental Sciences?","Do you like topics of biology?","Do you like topics of physics?",
            "Do you like to work hands on more than studying information?","Do you want to participate in an event that will challenge you with new and unique concepts?","Do you like working a lot with others?")



        binding.backToMenuButton.setOnClickListener {
            rootView.findNavController().navigateUp()
        }

        binding.trueButton.setOnClickListener {
           updateQuestion()

        }

        binding.falseButton.setOnClickListener {


        }


            binding.nextQuestionButton.setOnClickListener {

                if(index==9) {
                    binding.questionText.text = viewModel.eventResults.value

                    Toast.makeText(
                        this.context,
                        "Questionnaire Completed:\nThese are the best events for you based on your results.",
                        Toast.LENGTH_SHORT
                    ).show()
                    questionareResults()
                }
                    if(index<7) {
                viewModel.updateQuestionText(questions[index])


                binding.questionText.text = viewModel.questionText.value

            }
                if(index==7){
                binding.nextQuestionButton.text = "Finish Questionnaire"
                index++
            }
                index++


        }


        return rootView
    }
    fun updateQuestion(){


        if(index==1){
            num = num + 1
        }
        else if(index==2){
            num = num + 10
        }
        else if( index==3){
            num = num + 100
        }
        else if( index==4){
            num = num + 1000
        }
        else if( index==5){
            num = num + 10000
        }
        else if( index==6){
            num = num + 100000
        }
        else if( index==7){
            num = num + 1000000
        }
    }
    fun questionareResults(){
        if(num == 1){
            binding.questionText.text = "The best events for you are Chem Lab and Environmental Chemistry"
        }
        else if(num == 0){
            binding.questionText.text = "The best events for you are Astronomy, Rocks and Minerals, Ornithology, and Green Generation"
        }
        else if(num <= 11){
            binding.questionText.text = "The best events for you are Chem Lab, Environmental Chemistry, and Green Generation"
        }
        else if(num <= 111){
            binding.questionText.text = "The best events for you are Chem Lab, Cell Biology, Green Generation, and Dynamic Planet"
        }
        else if(num <= 1001){
            binding.questionText.text = "The best events for you are Anatomy and Physiology, Cell Biology, Green Generation, and Dynamic Planet"
        }
        else if(num <= 1111){
            binding.questionText.text = "The best events for you are Astronomy, Chem Lab, Remote Sensing, It's About Time, and Wifi Lab"
        }
        else if(num <= 111111){
            binding.questionText.text = "The best events for you are Bridge, Gravity Vehicle, Ping-Pong Parachute, Trajectory, and Wifi Lab"
        }
        else if(num <= 1111111){
            binding.questionText.text = "The best events for you are Codebusters, Detector Building, Trajectory, and Wifi Lab"
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}