package com.DKrywyj

class Appointment {

	

// Declaring Variables
	Date appDate
	String appTime
	String appDuration
	String roomNumber

    static constraints = {

//Write constraints
	appDate blank:false
	appTime blank:false
	appDuration blank:false
	roomNumber size:5..5, blank:false
	
    }

static belongsTo = [doctor:Doctor, patient:Patient, surgery:Surgery]
}
