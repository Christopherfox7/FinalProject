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


    fun updateQuestion(answer: Int){
        _questionNumber.value = _questionNumber.value?.plus(1)

        if(answer==1 && questionNumber.value==1){
            _results.value = 1
        }
        else if(answer==1 && questionNumber.value==2){
            _results.value = _results.value?.plus(10)
        }
        else if(answer==1 && questionNumber.value==3){
            _results.value = _results.value?.plus(100)
        }
        else if(answer==1 && questionNumber.value==4){
            _results.value = _results.value?.plus(1000)
        }
        else if(answer==1 && questionNumber.value==5){
            _results.value = _results.value?.plus(10000)
        }
        else if(answer==1 && questionNumber.value==6){
            _results.value = _results.value?.plus(100000)
        }
        else if(answer==1 && questionNumber.value==7){
            _results.value = _results.value?.plus(1000000)
        }
    }

    fun updateQuestionText(question: String){
        _questionText.value = question

    }


    fun questionareResults(){
        if(questionNumber.value!! == 1){
            _eventResults.value = "The best events for you are Chem Lab, and Environmental Chemistry"
        }
        else if(questionNumber.value!! <= 11){
            _eventResults.value = "The best events for you are Chem Lab, Environmental Chemistry, and Green Generation"
        }
        else if(questionNumber.value!! <= 111){
            _eventResults.value = "The best events for you are Chem Lab, Cell Biology, Green Generation, and Dynamic Planet"
        }

        else if(questionNumber.value!! <= 1111){
            _eventResults.value = "The best events for you are Anatomy and Physiology, Cell Biology, Green Generation, Disease Detectives, and Dynamic Planet"
        }
        else if(questionNumber.value!! <= 11111){
            _eventResults.value = "The best events for you are Bridge, Gravity Vehicle, Ping-Pong Parachute, Trajectory, and Wifi Lab"
        }
        else if(questionNumber.value!! <= 111111){
            _eventResults.value = "The best events for you are Codebusters, Detector Building, Trajectory, and Wifi Lab"
        }
    }

}

