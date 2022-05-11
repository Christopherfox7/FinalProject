package com.example.finalproject

import android.media.metrics.Event
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding
import androidx.activity.viewModels

class EventListViewHolder(val binding: ListItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {


       // private lateinit var currentEvent: Event

        fun bindEvent(event: String){
       //     currentEvent = event

            binding.button.text = event
            var name: String = binding.button.text.toString()

            binding.button.setOnClickListener {
         //       binding.root.findNavController().navigate(R.id.action_eventListFragment_to_eventResourcesFragment)
                val action = EventListFragmentDirections.actionEventListFragmentToEventResourcesFragment(name)
                binding.root.findNavController().navigate(action)


            }
        }
}