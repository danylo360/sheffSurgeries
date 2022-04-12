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
	recepUsername size:8..20, blank:false
	recepPassword size:5..15, blank:false
	recepPhone size:11..11, blank:false
	
    }
static hasMany = [surgery:Surgery]
static belongsTo = [surgery:Surgery]
}
