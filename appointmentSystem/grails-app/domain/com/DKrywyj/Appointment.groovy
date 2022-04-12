package com.DKrywyj

class Appointment {

	def scaffold=Appointment

// Declaring Variables
	Date appDate
	Date appTime
	Date appDuration
	String roomNumber

    static constraints = {

//Write constraints
	appDate blank:false
	appTime blank:false
	appDuration blank:false
	roomNumber size:5..5, blank:false
	
    }
static hasMany = [patient:Patient]
static belongsTo = [doctor:Doctor, patient:Patient, surgery:Surgery]
}
