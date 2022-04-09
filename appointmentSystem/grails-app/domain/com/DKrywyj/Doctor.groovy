package com.DKrywyj

class Doctor {

// Declaring Variables
	String fullName
	String qualifications
	String position
	String doctorEmail
	String password
	int doctorOffice
	int doctorPhone
	String bio


    static constraints = {

//Write constraints
	fullName size:3..50, blank:false
	qualifications size: 5..50, blank:false
	position size:5..50, blank:false
	doctorEmail size:1..300, blank:false
	password size:10..150, blank:false
	doctorOffice size:1..100, blank:false
	doctorPhone min:11, blank:false
	bio size:10..300, blank:false
    }
}
