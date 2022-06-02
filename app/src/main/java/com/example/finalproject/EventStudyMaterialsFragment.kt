package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.media.AudioAttributes
import android.media.SoundPool
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentEventStudyMaterialsBinding

class EventStudyMaterialsFragment : Fragment() {

    private val viewModel: EventViewModel by viewModels()


    private var _binding: FragmentEventStudyMaterialsBinding? = null
    private val binding get() = _binding!!

    var soundPool: SoundPool? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventStudyMaterialsBinding.inflate(inflater, container, false)

        val args = EventStudyMaterialsFragmentArgs.fromBundle(requireArguments())


        viewModel.changeName(args.eventtitle)

        viewModel.moreInfo()


        binding.studyFragment.startAnimation(AnimationUtils.loadAnimation(this.context, androidx.appcompat.R.anim.abc_slide_in_bottom))


        var audioAttributes = AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()

        soundPool = SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAttributes).build()



        var grosbeakSound = soundPool!!.load(this.context, R.raw.grosbeak, 1)
        var robinSound = soundPool!!.load(this.context, R.raw.robinnoise, 1)
        var yellowThroatSound = soundPool!!.load(this.context, R.raw.yellowthroat, 1)

        if(viewModel.infoPackage.value ==1){
            binding.imageView.setImageResource(R.drawable.bridgeone)
            binding.imageView2.setImageResource(R.drawable.bridge_two)
            binding.eventText.text = "These are two sample bridges which are tested for strength based on how much sand they can hold until they break."
            binding.leftButton.isVisible = isHidden
            binding.rightButton.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
            binding.stopButton.isVisible = isHidden
        }
        else if(viewModel.infoPackage.value ==2){
            binding.imageView.setImageResource(R.drawable.grav_one)
            binding.imageView2.setImageResource(R.drawable.grav_two)
            binding.eventText.text = "On top is an example vehicle that can be build and below is an example ramp that teams can build."
            binding.leftButton.isVisible = isHidden
            binding.rightButton.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
            binding.stopButton.isVisible = isHidden

        }
        else if(viewModel.infoPackage.value ==3) {
            binding.imageView.isVisible = isHidden
            binding.eventText.text = "These are some example bird calls that participants may be tested on for identification purposes."
            binding.imageView2.isVisible = isHidden
            binding.leftButton.text = "Grosbeak"

            binding.startAppButton.text = "Robin"
            binding.rightButton.text = "Yellow Throat"
        }
        else if(viewModel.infoPackage.value ==4){
            binding.imageView.setImageResource(R.drawable.ppp_one)
            binding.eventText.text = "This image shows an example rocket and parachute that participants can build."
            binding.imageView2.isVisible = isHidden
            binding.leftButton.isVisible = isHidden
            binding.rightButton.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
            binding.stopButton.isVisible = isHidden

        }
        else if(viewModel.infoPackage.value ==5){
            binding.imageView.setImageResource(R.drawable.traj_one)
            binding.imageView2.setImageResource(R.drawable.traj_two)
            binding.eventText.text = "The top image shows an example catapult launcher and the bottom shows an example slingshot launcher."
            binding.leftButton.isVisible = isHidden
            binding.rightButton.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
            binding.stopButton.isVisible = isHidden

        }
        else if(viewModel.infoPackage.value ==6){
            binding.imageView.setImageResource(R.drawable.wifi_one)
            binding.imageView2.setImageResource(R.drawable.wifi_two)
            binding.eventText.text = "On top is an image of the electromagnetic spectrum an important part of the event text and the bottom shows parts that can be used in the construction of an antenna."
            binding.leftButton.isVisible = isHidden
            binding.rightButton.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
            binding.stopButton.isVisible = isHidden

        }

        binding.leftButton.setOnClickListener { soundPool?.play(grosbeakSound, 1F, 1F, 1, 0, 1F) }
        binding.startAppButton.setOnClickListener { soundPool?.play(robinSound, 1F, 1F, 1, 0, 1F) }
        binding.rightButton.setOnClickListener {soundPool?.play(yellowThroatSound, 1F, 1F, 1, 0, 1F) }

            binding.stopButton.setOnClickListener {
                soundPool?.stop(grosbeakSound)
                soundPool?.stop(robinSound)
                soundPool?.stop(yellowThroatSound)
            }



        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}