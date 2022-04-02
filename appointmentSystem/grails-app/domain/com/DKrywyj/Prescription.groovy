package com.DKrywyj

class Prescription {

// Declaring Variables
	String pharmacyName
	int prescriptionNumber
	String medicine
	int totalCost
	Date dateIssued
	String patientPaying


    static constraints = {

//Write constraints
	pharmacyName size:3..30, blank:false
	prescriptionNumber size:5..50, blank:false
	medicine max:15, blank:false
	totalCost size:3..30, blank:false
	dateIssued blank:false
	patientPaying max:11, blank:false
	
    }
}
