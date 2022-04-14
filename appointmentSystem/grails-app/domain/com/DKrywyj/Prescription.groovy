package com.DKrywyj

class Prescription {

// Declaring Variables
	String pharmacyName
	String prescriptionNumber
	String medicine
	int totalCost
	Date dateIssued
	String patientPaying


    static constraints = {

//Write constraints
	pharmacyName size:3..30, blank:false
	prescriptionNumber blank:false
	medicine size:0..30, blank:false
	totalCost size:0..30, blank:false
	dateIssued blank:false
	patientPaying size:0..3, blank:false
	
    }

static belongsTo = [patient:Patient, doctor:Doctor]
}
