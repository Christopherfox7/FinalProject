package com.example.finalproject

import android.graphics.drawable.AnimationDrawable
import android.media.AudioAttributes
import android.media.SoundPool
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentWelcomeBinding



class WelcomeFragment : Fragment() {

    var soundPool: SoundPool? = null

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.animationLayout.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom))

        binding.fullLayout.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_slide_out_top))


//
//        defaultCrySounds = listOf(
//            soundPool!!.load(activity,R.raw.bungerdefaultcry1,1),
//            soundPool!!.load(activity,R.raw.bungerdefaultcry2,1),
//            soundPool!!.load(activity,R.raw.bungerdefaultcry3,1)
//        )
//
//        binding.imageView.setOnClickListener {
//            soundPool?.play(defaultCrySounds[(0..2).random()], 1F,1F,1,0, 1F)
//        }


        binding.startAppButton.setOnClickListener {

           rootView.findNavController().navigate(R.id.action_welcomeFragment_to_eventListFragment)
        }




        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        soundPool!!.release()
        soundPool = null
    }
}