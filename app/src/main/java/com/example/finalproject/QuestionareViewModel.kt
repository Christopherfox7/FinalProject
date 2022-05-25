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


    fun updateQuestion(answer: Int){
        _questionNumber.value = _questionNumber.value?.plus(1)

        if(answer==1 && questionNumber.value==1){
            _results.value = 1
        }
        else if(answer==1 && questionNumber.value==2){
            _results.value = _results.value?.plus(2)
        }
        else if(answer==1 && questionNumber.value==3){
            _results.value = _results.value?.plus(3)
        }
        else if(answer==1 && questionNumber.value==4){
            _results.value = _results.value?.plus(4)
        }
        else if(answer==1 && questionNumber.value==5){
            _results.value = _results.value?.plus(5)
        }
        else if(answer==1 && questionNumber.value==6){
            _results.value = _results.value?.plus(6)
        }
    }

    fun updateQuestionText(question: String){
        _questionText.value = question

    }


}

