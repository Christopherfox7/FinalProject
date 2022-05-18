package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentEventListBinding
import com.example.finalproject.databinding.FragmentGeneralInfoBinding

class GeneralInfoFragment : Fragment() {

    private var _binding: FragmentGeneralInfoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGeneralInfoBinding.inflate(inflater, container, false)

        binding.phoneButton.setOnClickListener { dialPhoneNumber("01244951200") }

        binding.websiteButton.setOnClickListener { openWebPage("https://www.soinc.org/code-ethics-general-rules") }

        binding.teamButton.setOnClickListener { openWebPage("https://www.soinc.org/start-team/organizing-team#:~:text=A%20Science%20Olympiad%20team%20is,same%20understanding%20of%20the%20rules.") }

        return binding.root
    }
    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

        startActivity(intent)

    }
    fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        startActivity(intent)

    }

    fun composeEmail(addresses: String, subject: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:")
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, subject)

        }
        //        binding.emailButton.setOnClickListener{composeEmail("info@sofworld.org", "text")}
        //  if (intent.resolveActivity(packageManager) != null) {
        startActivity(intent)
        //  }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}