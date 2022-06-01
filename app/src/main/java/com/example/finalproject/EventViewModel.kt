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


    private val _infoPackage = MutableLiveData(0)
    val infoPackage: LiveData<Int>
        get() = _infoPackage

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
        } else if ((eventTitle.value ?: 0).equals("Dynamic Planet")) {
            _eventRulesLink.value = "https://www.soinc.org/dynamic-planet-c"
        } else if ((eventTitle.value ?: 0).equals("Environmental Chemistry")) {
            _eventRulesLink.value = "https://www.soinc.org/environmental-chemistry-c"
        }
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


    }


    fun eventInfoPack() {
        if ((eventTitle.value ?: 0).equals("Anatomy and Physiology")) {
            _eventAboutInfo.value = "This event assesses participants on their understanding of the anatomy and physiology for the human Nervous, Sense Organs, and Endocrine systems. " +
                    "The event is run in stations, with usually about 10-20 stations, there will be sections in the test corresponding to each of the stations with questions. "+
                    "Participants are allowed a binder which they can store any information of their choosing in."
        } else if ((eventTitle.value ?: 0).equals("Astronomy")) {
            _eventAboutInfo.value = "This event focuses on various fields of astronomy like the study of stars, galaxies, etc. The topics rotates from season to season. "+
                    "The event is a test the allows the use of 2 binders or 2 laptops for storing information. There is a strong emphasis on complex math calculations involve the different concepts."
        } else if ((eventTitle.value ?: 0).equals("Bridge")) {
            _eventAboutInfo.value = "Bridge Building is a construction event that involves building and testing a bridge. There are a countless number of designs for a bridge. Bridges are designed using trusses. Many different truss structures exist. "+
                    "Prior to a competition, teams  construct their bridge. Bridge building involves building and breaking many bridges to test strength of different building techniques."
        } else if ((eventTitle.value ?: 0).equals("Cell Biology")) {
            _eventAboutInfo.value = "Cell Biology is an event about eukaryotic and prokaryotic cells. It covers a wide variety of topics in biology, and typically takes the form of several stations with demonstrations or diagrams. "+
                    "Questions may cover subjects such as organelle structure and function, cell membrane structure, the cell cycle and mitosis, the difference between different types of cells (prokaryotic and eukaryotic), and other miscellaneous topics such as enzymes and chromosome structure. "+
                    "This is a test event that allows no additional resources."
        } else if ((eventTitle.value ?: 0).equals("Chem Lab")) {
            _eventAboutInfo.value = "This event focuses on various topics of chemistry that rotate from season to season. The topics include Acids and Bases, Aqueous Solutions, Thermodynamics, Physical Properties, etc. "+
                    "The event consist of a series of test questions and labs to be performed and a single cheat sheet is allowed."
        } else if ((eventTitle.value ?: 0).equals("Codebusters")) {
            _eventAboutInfo.value = "This event involves 3 partners solving various encrypted messages with a variety of types of encryption."
        } else if ((eventTitle.value ?: 0).equals("Detector Building")) {
            _eventAboutInfo.value = "Teams will build a durable Conductivity Device that will accurately measure and display a variety of different measurements like voltage and concentrations of NaCl in parts per million. "+
                    "Part of the event involves the use of the device and the other part involves taking a test with a binder."
        } else if ((eventTitle.value ?: 0).equals("Dynamic Planet")) {
            _eventAboutInfo.value = "Dynamic Planet is an event concerned with the processes which change the Earth. The topic changes from year to year between oceans, freshwater, glaciers, and tectonics. "+
                    "A single binder is allowed for this test only event."
        } else if ((eventTitle.value ?: 0).equals("Environmental Chemistry")) {
            _eventAboutInfo.value = "The event test knowledge of environmental chemistry, including chemical reactions, characterization, and quantification of freshwater, with both test questions and labs."
        }
        else if((eventTitle.value?:0).equals("Gravity Vehicle")){
            _eventAboutInfo.value = "Teams design, build and test one Vehicle and Ramp that uses the Vehicle's gravitational potential energy as its sole means of propulsion to reach a target as quickly and accurately as possible."
        }
        else if((eventTitle.value?:0).equals("Green Generation")){
            _eventAboutInfo.value = "Team are tested on an understanding of general ecological principles, the history and consequences of human impact on our environment, solutions to reversing trends and sustainability concepts. "+
                    "A single cheat sheet is allowed for partners in this event. This event is very general and follows many of the topics taught in AP Environmental Science."
        }
        else if((eventTitle.value?:0).equals("It's About Time")){
            _eventAboutInfo.value = "Teams answer questions related to time on a test with a binder allowed. "+
                    "Teams construct and bring one non-electrical device to measure time intervals between 10 and 300 seconds with a goal of being as accurate as possible."
        }
        else if((eventTitle.value?:0).equals("Ornithology")){
            _eventAboutInfo.value = "The event is about life science revolving around the study of birds. The event revolves around competitors assessing their knowledge of information about specific species,"+
                    "classes, and families of birds as well as questions about general bird anatomy. "+
                    "Species that can be used in the event are given through the Official Bird List. A binder is allowed for this event. "+
                    "The test is a series of stations where teams answer questions at each station."
        }
        else if((eventTitle.value?:0).equals("Ping-Pong Parachute")){
            _eventAboutInfo.value = "Prior to a competition, teams build a bottle rocket to launch a ping pong ball attached to a parachute to stay aloft for the greatest amount of time."
        }
        else if((eventTitle.value?:0).equals("Remote Sensing")){
            _eventAboutInfo.value = "Teams use remote sensing imagery, data and computational processing to complete tasks related to climate change processes in the Earth system. "+
                    "The event is a test that allows for a single cheat sheet. "
        }
        else if((eventTitle.value?:0).equals("Rocks and Minerals")){
            _eventAboutInfo.value = "Teams take a test, identify rocks and minerals from the official list, and answer questions about them. "+
                    "This event has team go to stations and answer questions at each station. A binder is allowed for the test"
        }
        else if((eventTitle.value?:0).equals("Trajectory")){
            _eventAboutInfo.value = "Teams build a device like a catapult or a slingshot that will launch a small ball with the goal of landing it within a target area."
        }
        else if((eventTitle.value?:0).equals("Wifi Lab")) {
            _eventAboutInfo.value = "Teams build an antenna that is tested at competitions for single strength at various distances. "+
                    "Teams also take a test with a binder about various topics such as the electromagnetic spectrum and antennas in general."

        }
    }
    fun moreInfo(){
        if ((eventTitle.value ?: 0).equals("Bridge")) {
            _infoPackage.value = 1
        }
        else if ((eventTitle.value ?: 0).equals("Gravity Vehicle")) {
            _infoPackage.value = 2
        }
        else if ((eventTitle.value ?: 0).equals("Ornithology")) {
            _infoPackage.value = 3

        }
        else if ((eventTitle.value ?: 0).equals("Ping-Pong Parachute")) {
            _infoPackage.value = 4

        }
        else if ((eventTitle.value ?: 0).equals("Trajectory")) {
            _infoPackage.value = 5

        }
        else if ((eventTitle.value ?: 0).equals("Wifi Lab")) {
            _infoPackage.value = 6

        }

    }
}