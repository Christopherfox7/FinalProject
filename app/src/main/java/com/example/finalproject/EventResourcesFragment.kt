package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.finalproject.databinding.FragmentEventResourcesBinding
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController


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

        binding.resourcesFragment.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_slide_in_bottom))


        if(viewModel.eventTitle.value.toString().equals("Astronomy")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Anatomy and Physiology")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Cell Biology")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Chem Lab")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Codebusters")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Detector Building")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Dynamic Planet")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Environmental Chemistry")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Green Generation")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("It's About Time")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Remote Sensing")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        else if(viewModel.eventTitle.value.toString().equals("Rocks and Minerals")){
            binding.toStudyFragmentButton.isVisible = isHidden
        }
        viewModel.eventInfoPack()

        binding.eventInfoTextView.text = viewModel.eventAboutInfo.value.toString()

        binding.eventRulesButton.setOnClickListener { openRulesPage(viewModel.eventRulesLink.value.toString()) }



        binding.toStudyFragmentButton.setOnClickListener{binding.root.findNavController().navigate(EventResourcesFragmentDirections.actionEventResourcesFragmentToEventStudyMaterialsFragment(viewModel.eventTitle.value.toString()))}

        return binding.root
    }
    fun openRulesPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

        startActivity(intent)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}