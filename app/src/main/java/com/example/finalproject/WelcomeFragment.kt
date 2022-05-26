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
    var defaultCrySounds = listOf<Int>()

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!





    private lateinit var pictureAnimation: AnimationDrawable

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.animationLayout.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom))

        var audioAttributes = AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()

        soundPool = SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAttributes).build()

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
            binding.fullLayout.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom))
           rootView.findNavController().navigate(R.id.action_welcomeFragment_to_eventListFragment)
        }


        soundPool = SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAttributes).build()




    var grosbeakSound = soundPool!!.load(this.context, R.raw.grosbeak,1)
        var robinSound = soundPool!!.load(this.context, R.raw.robinnoise,1)
        var yellowThroatSound = soundPool!!.load(this.context, R.raw.yellowthroat,1)


        var x =0
        binding.button2.setOnClickListener {
            if(x==0) {
                soundPool?.play(grosbeakSound, 1F, 1F, 1, 0, 1F)
                x++
            }
            else{
                soundPool?.stop(grosbeakSound)

            }

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