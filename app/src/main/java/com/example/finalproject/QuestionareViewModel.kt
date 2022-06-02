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

    private val _results = MutableLiveData(0)
    val results: LiveData<Int>
        get() = _results

    private val _eventResults = MutableLiveData("")
    val eventResults : LiveData<String>
        get() = _eventResults




    fun updateQuestionText(question: String){
        _questionText.value = question

    }




}

