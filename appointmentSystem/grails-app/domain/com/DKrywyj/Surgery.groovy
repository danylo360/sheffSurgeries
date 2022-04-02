package com.DKrywyj

class Surgery {

// Declaring Variables
	String name
	String postcode
	int telepone
	int numberOfPatients
	String description
	Date openingTimes


    static constraints = {

//Write constraints
	name size:3..30, blank:false
	postcode min:6, blank:false
	telephone min:11, blank:false
	numberOfPatients size:1..300, blank:false
	description Size:10..150, blank:false
	openingTimes blank:false
    }
}
