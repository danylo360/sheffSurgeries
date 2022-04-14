package com.DKrywyj

class Surgery {

// Declaring Variables
	String name
	String postcode
	String telepone
	int numberOfPatients
	String description
	Date openingTimes


    static constraints = {

//Write constraints
	name size:3..30, blank:false
	postcode size:6..6, blank:false
	telephone size:11..11, blank:false
	numberOfPatients size:1..300, blank:false
	description size:10..150, blank:false
	openingTimes blank:false
    }
static hasMany = [appointment:Appointment, nurse:Nurse, doctor:Doctor, patient:Patient, receptionist:Receptionist]
}
