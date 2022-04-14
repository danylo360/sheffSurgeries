<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css" />
    <title>SheffSurgeries</title>
</head>
<body>
<div class="Doctor">
	        <h3>Doctor</h3>
<p> </p>
	<button type="button" class="controllers">
    	       <g:link controller="Doctor" action="create">Add Course</g:link>
	</button>
</div>

<div class="Patients">
	        <h3>Patients</h3>
<p> </p>
	<button type="button" class="controllers">
    	       <g:link controller="Patient" action="create">Add Patient</g:link>
	</button>
</div>

<div class="Nurses">
	        <h3>Nurses</h3>
<p> </p>
	<button type="button" class="controllers">
    	       <g:link controller="Nurse" action="create">Add Nurse</g:link>
	</button>
</div>

<div class="Receptionist">
	        <h3>Receptionists</h3>
<p> </p>
	<button type="button" class="controllers">
    	       <g:link controller="Receptionist" action="create">Add Receptionists</g:link>
	</button>
</div>
</html>
