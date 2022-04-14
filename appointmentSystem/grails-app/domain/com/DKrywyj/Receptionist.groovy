package com.DKrywyj

class Receptionist {


// Declaring Variables
	String recepName
	String recepEmail
	String username
	String password
	String recepPhone


    static constraints = {

//Write constraints
	recepName size:3..30, blank:false
	recepEmail size:5..50, blank:false
	username size:8..20, blank:false
	password size:5..15, blank:false
	recepPhone size:11..11, blank:false
	


	
    }

static belongsTo = [surgery:Surgery]
}
