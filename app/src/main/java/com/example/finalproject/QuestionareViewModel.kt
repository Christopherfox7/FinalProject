package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuestionareViewModel: ViewModel() {

    private val _questionText = MutableLiveData("")
    val questionText: LiveData<String>
        get() = _questionText

    private val _questionNumber = MutableLiveData(0)
    val questionNumber: LiveData<Int>
        get() = _questionNumber
}