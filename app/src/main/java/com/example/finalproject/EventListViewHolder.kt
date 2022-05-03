package com.example.finalproject

import android.media.metrics.Event
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemLayoutBinding

class EventListViewHolder(val binding: ListItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {

       // private lateinit var currentEvent: Event

        fun bindEvent(event: String){
       //     currentEvent = event

            binding.button.text = event
        }
}