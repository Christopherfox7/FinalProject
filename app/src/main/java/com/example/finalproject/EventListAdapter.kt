package com.example.finalproject

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.finalproject.databinding.ListItemLayoutBinding

class EventListAdapter (val eventList: List<String>) : RecyclerView.Adapter<EventListViewHolder>() {
    override fun getItemCount(): Int {
        return eventList.size
    }
    override fun onBindViewHolder(currentViewHolder: EventListViewHolder, position: Int) {
        val currentEvent = eventList[position]
        currentViewHolder.bindEvent(currentEvent)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventListViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventListViewHolder(binding)
    }

}
