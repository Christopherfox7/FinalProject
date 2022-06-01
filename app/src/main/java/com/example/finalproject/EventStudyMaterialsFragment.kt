package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.media.AudioAttributes
import android.media.SoundPool
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


        var audioAttributes = AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()

        soundPool = SoundPool.Builder().setMaxStreams(6).setAudioAttributes(audioAttributes).build()

     //   binding.startAppButton.setOnClickListener { binding.eventText.text = viewModel.eventTitle.value.toString() }


        var grosbeakSound = soundPool!!.load(this.context, R.raw.grosbeak, 1)
        var robinSound = soundPool!!.load(this.context, R.raw.robinnoise, 1)
        var yellowThroatSound = soundPool!!.load(this.context, R.raw.yellowthroat, 1)

        if(viewModel.infoPackage.value ==1){
            binding.imageView.setImageResource(R.drawable.bridgeone)
            binding.imageView2.setImageResource(R.drawable.bridge_two)
            binding.leftButton.isVisible = isHidden
            binding.button4.isVisible = isHidden
            binding.startAppButton.isVisible = isHidden
        }
        else if(viewModel.infoPackage.value ==4) {
            binding.imageView.isVisible = isHidden
            binding.imageView2.isVisible = isHidden
            binding.leftButton.text = "Grosbeak"
            binding.leftButton.setOnClickListener { soundPool?.play(grosbeakSound, 1F, 1F, 1, 0, 1F) }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}