package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EventViewModel: ViewModel() {

    private val _eventName = MutableLiveData("")
    val eventName: LiveData<String>
    get() = _eventName

    private val _eventRulesLink = MutableLiveData("")
    val eventRulesLink: LiveData<String>
        get() = _eventRulesLink


    fun changeName(){
      // _eventName.value =
    }
}