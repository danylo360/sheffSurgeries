package com.DKrywyj

class Patient {

// Declaring Variables
	String patientName
	String patientAddress
	String pateintResidence
	Date patientDob
	String patientID
	Date dateRegistered
	String patientPhone


    static constraints = {

//Write constraints
	patientName size:3..30, blank:false
	patientAddress size:10..50, blank:false
	pateintResidence size:10..50, blank:false
	patientDob blank:false
	patientID size:7..7, blank:false
	dateRegistered blank:false
	patientPhone size: 11..11, blank:false
    }
//static hasMany = [doctor:Doctor, prescription:Prescription, appointment:Appointment, surgery:Surgery]
//static belongsTo = [surgey:Surgery, doctor:Doctor]
}
