package com.DKrywyj

class Doctor {

// Declaring Variables
	String fullName
	String qualifications
	String position
	String email
	String password
	int doctorOffice
	String doctorPhone
	String bio


    static constraints = {

//Write constraints
	fullName size:3..50, blank:false
	qualifications size: 5..50, blank:false
	position size:5..50, blank:false
	email size:1..300, blank:false
	password size:10..150, blank:false
	doctorOffice size:1..100, blank:false
	doctorPhone size:11..11, blank:false
	doctorPhone size:11..11, blank:false
	bio size:10..300, blank:false

    }
static hasMany = [prescription:Prescription, appointment:Appointment, nurse:Nurse, patient:Patient]
static belongsTo = [surgery:Surgery]
}
