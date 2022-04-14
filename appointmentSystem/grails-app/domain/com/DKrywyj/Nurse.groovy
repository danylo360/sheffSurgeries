package com.DKrywyj

class Nurse {

// Declaring Variables
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone


    static constraints = {

//Write constraints
	nurseName size:5..50, blank:false
	nurseEmail size:5..50, blank:false
	nurseOffice size:5..5, blank:false
	nurseOffice size:5..10, blank:false
	nursePhone size:11..11, blank:false
	
	
    }
static hasMany = [doctor:Doctor]
static belongsTo = [doctor:Doctor, surgery:Surgery]
}
