package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentEventResourcesBinding
import androidx.fragment.app.viewModels


class EventResourcesFragment : Fragment() {

    private val viewModel: EventViewModel by viewModels()
    private var _binding: FragmentEventResourcesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventResourcesBinding.inflate(inflater, container, false)

        val args = EventResourcesFragmentArgs.fromBundle(requireArguments())
        binding.nameOfEvent.text = args.eventName

       viewModel.changeName(args.eventName)

        viewModel.addLink()

        binding.eventRulesButton.setOnClickListener { openRulesPage(viewModel.eventRulesLink.value.toString()) }

        binding.aboutEventRadioButton.setOnClickListener{editEventText()}

        binding.eventRulesRadioButton.setOnClickListener{editEventText()}

        return binding.root
    }
    fun openRulesPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

        startActivity(intent)

    }

    fun editEventText(){

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}