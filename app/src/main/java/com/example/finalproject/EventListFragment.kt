package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentEventListBinding


class EventListFragment : Fragment() {

    private var _binding: FragmentEventListBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventListBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.eventListFragment.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_slide_in_bottom))

        val events = listOf<String>("Anatomy and Physiology", "Astronomy", "Bridge", "Cell Biology", "Chem Lab","Codebusters", "Detector Building",
            "Dynamic Planet", "Environmental Chemistry", "Gravity Vehicle", "Green Generation", "It's About Time",
            "Ornithology", "Ping-Pong Parachute", "Remote Sensing", "Rocks and Minerals", "Trajectory", "Wifi Lab")

        val mAdapter = EventListAdapter(events)
        binding.recyclerView.adapter = mAdapter

        binding.extraInfoButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_eventListFragment_to_generalInfoFragment)

        }

        binding.buttonToQuestionare.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_eventListFragment_to_questionareFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}