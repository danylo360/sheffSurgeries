package com.DKrywyj

class Receptionist {

// Declaring Variables
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone


    static constraints = {

//Write constraints
	recepName size:3..30, blank:false
	recepEmail size:5..50, blank:false
	recepUsername max:15, blank:false
	recepPassword size:5..15, blank:false
	recepPhone max:11, blank:false
	
    }
}
