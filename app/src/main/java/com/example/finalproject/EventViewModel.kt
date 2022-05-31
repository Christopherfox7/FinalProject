package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EventViewModel: ViewModel() {

    private val _eventTitle = MutableLiveData("")
    val eventTitle: LiveData<String>
        get() = _eventTitle

    private val _eventRulesLink = MutableLiveData("")
    val eventRulesLink: LiveData<String>
        get() = _eventRulesLink


    private val _eventAboutInfo = MutableLiveData("")
    val eventAboutInfo: LiveData<String>
        get() = _eventAboutInfo


    fun changeName(name: String) {
        _eventTitle.value = name
    }

    fun addLink() {
        if ((eventTitle.value ?: 0).equals("Anatomy and Physiology")) {
            _eventRulesLink.value = "https://www.soinc.org/anatomy-and-physiology-c"
        } else if ((eventTitle.value ?: 0).equals("Astronomy")) {
            _eventRulesLink.value = "https://www.soinc.org/astronomy-c"
        } else if ((eventTitle.value ?: 0).equals("Bridge")) {
            _eventRulesLink.value = "https://www.soinc.org/bridge-c"
        } else if ((eventTitle.value ?: 0).equals("Cell Biology")) {
            _eventRulesLink.value = "https://www.soinc.org/cell-biology-c"
        } else if ((eventTitle.value ?: 0).equals("Chem Lab")) {
            _eventRulesLink.value = "https://www.soinc.org/chem-lab-c"
        } else if ((eventTitle.value ?: 0).equals("Codebusters")) {
            _eventRulesLink.value = "https://www.soinc.org/codebusters-c"
        } else if ((eventTitle.value ?: 0).equals("Detector Building")) {
            _eventRulesLink.value = "https://www.soinc.org/detector-building-c"
        } else if ((eventTitle.value ?: 0).equals("Disease Detectives")) {
            _eventRulesLink.value = "https://www.soinc.org/disease-detectives-c"
        } else if ((eventTitle.value ?: 0).equals("Dynamic Planet")) {
            _eventRulesLink.value = "https://www.soinc.org/dynamic-planet-c"
        } else if ((eventTitle.value ?: 0).equals("Environmental Chemistry")) {
            _eventRulesLink.value = "https://www.soinc.org/environmental-chemistry-c"
        }
//        else if((eventTitle.value?:0).equals("Experimental Design")){
//            _eventRulesLink.value = "https://www.soinc.org/experimental-design-c"
//        }
//        else if((eventTitle.value?:0).equals("Forensics")){
//            _eventRulesLink.value = "https://www.soinc.org/forensics-c"
//        }
        else if ((eventTitle.value ?: 0).equals("Gravity Vehicle")) {
            _eventRulesLink.value = "https://www.soinc.org/gravity-vehicle-c"
        } else if ((eventTitle.value ?: 0).equals("Green Generation")) {
            _eventRulesLink.value = "https://www.soinc.org/green-generation-c"
        } else if ((eventTitle.value ?: 0).equals("It's About Time")) {
            _eventRulesLink.value = "https://www.soinc.org/its-about-time-c"
        } else if ((eventTitle.value ?: 0).equals("Ornithology")) {
            _eventRulesLink.value = "https://www.soinc.org/ornithology-c"
        } else if ((eventTitle.value ?: 0).equals("Ping-Pong Parachute")) {
            _eventRulesLink.value = "https://www.soinc.org/ping-pong-parachute-c"
        } else if ((eventTitle.value ?: 0).equals("Remote Sensing")) {
            _eventRulesLink.value = "https://www.soinc.org/remote-sensing-c"
        } else if ((eventTitle.value ?: 0).equals("Rocks and Minerals")) {
            _eventRulesLink.value = "https://www.soinc.org/rocks-and-minerals-c"
        } else if ((eventTitle.value ?: 0).equals("Trajectory")) {
            _eventRulesLink.value = "https://www.soinc.org/trajectory-c"
        } else if ((eventTitle.value ?: 0).equals("Wifi Lab")) {
            _eventRulesLink.value = "https://www.soinc.org/wifi-lab-c"
        }
//        else if((eventTitle.value?:0).equals("Write It Do It")){
//            _eventRulesLink.value = "https://www.soinc.org/write-it-do-it-c"
//        }

//        else if((eventTitle.value?:0).equals("Wright Stuff")){
//            _eventRulesLink.value = "https://www.soinc.org/wright-stuff-c"
//        }


    }


    fun eventInfoPack(name: String) {
        if ((eventTitle.value ?: 0).equals("Anatomy and Physiology")) {
            _eventRulesLink.value = "https://www.soinc.org/anatomy-and-physiology-c"
        } else if ((eventTitle.value ?: 0).equals("Astronomy")) {
            _eventRulesLink.value = "https://www.soinc.org/astronomy-c"
        } else if ((eventTitle.value ?: 0).equals("Bridge")) {
            _eventRulesLink.value = "https://www.soinc.org/bridge-c"
        } else if ((eventTitle.value ?: 0).equals("Cell Biology")) {
            _eventRulesLink.value = "https://www.soinc.org/cell-biology-c"
        } else if ((eventTitle.value ?: 0).equals("Chem Lab")) {
            _eventRulesLink.value = "https://www.soinc.org/chem-lab-c"
        } else if ((eventTitle.value ?: 0).equals("Codebusters")) {
            _eventRulesLink.value = "https://www.soinc.org/codebusters-c"
        } else if ((eventTitle.value ?: 0).equals("Detector Building")) {
            _eventRulesLink.value = "https://www.soinc.org/detector-building-c"
        } else if ((eventTitle.value ?: 0).equals("Disease Detectives")) {
            _eventRulesLink.value = "https://www.soinc.org/disease-detectives-c"
        } else if ((eventTitle.value ?: 0).equals("Dynamic Planet")) {
            _eventRulesLink.value = "https://www.soinc.org/dynamic-planet-c"
        } else if ((eventTitle.value ?: 0).equals("Environmental Chemistry")) {
            _eventRulesLink.value = "https://www.soinc.org/environmental-chemistry-c"
        }
        else if((eventTitle.value?:0).equals("Gravity Vehicle")){
            _eventRulesLink.value = "https://www.soinc.org/gravity-vehicle-c"
        }
        else if((eventTitle.value?:0).equals("Green Generation")){
            _eventRulesLink.value = "https://www.soinc.org/green-generation-c"
        }
        else if((eventTitle.value?:0).equals("It's About Time")){
            _eventRulesLink.value = "https://www.soinc.org/its-about-time-c"
        }
        else if((eventTitle.value?:0).equals("Ornithology")){
            _eventRulesLink.value = "https://www.soinc.org/ornithology-c"
        }
        else if((eventTitle.value?:0).equals("Ping-Pong Parachute")){
            _eventRulesLink.value = "https://www.soinc.org/ping-pong-parachute-c"
        }
        else if((eventTitle.value?:0).equals("Remote Sensing")){
            _eventRulesLink.value = "https://www.soinc.org/remote-sensing-c"
        }
        else if((eventTitle.value?:0).equals("Rocks and Minerals")){
            _eventRulesLink.value = "https://www.soinc.org/rocks-and-minerals-c"
        }
        else if((eventTitle.value?:0).equals("Trajectory")){
            _eventRulesLink.value = "https://www.soinc.org/trajectory-c"
        }
        else if((eventTitle.value?:0).equals("Wifi Lab")) {
            _eventRulesLink.value = "https://www.soinc.org/wifi-lab-c"
        }
    }
}