<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Shipping</title>
<script type="text/javascript" src="Client-Model/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="Client-Model/controllerMain.js"></script>


<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.4.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/validation.js" type="text/javascript"></script>
</head>
<body>

<div class="container">
<h2>Register</h2>
<form action="">
<hr>

<div class="form-group">
	 <label for="shipname">ShipName*:</label>
	 <input type="text" class="form-control" id="shipName" name="shipName" onchange="emptyCheck('shipName',shipName)" onclick="emptyCheck('username',username)">
	 <div class="container">
	 <p class="text-muted">Shipname can contain any letters and numbers, without spaces.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="shippingCost">ShippingCost*:</label>
	 <input type="text" class="form-control" id="shippingCost" name="shippingCost" onchange="emailValidation('email',email)" onclick="emailValidation('email',email)">
	 <div class="container">
	 <p class="text-muted">Please provide your Shippingcost.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="departFrom">DepartFrom*:</label>
	 <input type="text" class="form-control" id="departFrom" name="departFrom" onchange="nicValidation('nic',nic)" onclick="nicValidation('nic',nic)">
	 <div class="container">
	 <p class="text-muted">Please provide your departFrom.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="depdate">DepartTimeDate*:</label>
	 <input type="text" class="form-control" id="depdate" name="depdate" onchange="mobileValidation('mobile',mobile)" onclick="mobileValidation('mobile',mobile)">
	 <div class="container">
	 <p class="text-muted">Please provide your DepartTimeDate.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="des">Destination*:</label>
	 <input type="text" class="form-control" id="des" name="des">
	<div class="container">
	 <p class="text-muted">Please provide your destination.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="cfpwd">ArrivalTimeDate*:</label>
	 <input type="text" class="form-control" id="cfpwd" name="cfpwd">
	<div class="container">
	 <p class="text-muted">Please enter arrivalTimeDate.</p>
	 </div>
 </div>
 <div class="form-group">
	 <label for="status">Status*:</label>
	 <input type="text" class="form-control" id="status" name="status">
	<div class="container">
	 <p class="text-muted">Please enter status.</p>
	 </div>
 </div>
 <div class="form-group">
	 <label for="company">Company*:</label>
	 <input type="text" class="form-control" id="company" name="company">
	<div class="container">
	 <p class="text-muted">Please enter company name.</p>
	 </div>
 </div>
 <div class="form-group">
	 <label for="cont">CompanyContactNo*:</label>
	 <input type="tel" class="form-control" id="cont" name="cont">
	<div class="container">
	 <p class="text-muted">Please enter contact no.</p>
	 </div>
 </div>
 
 <div class="form-group">
	 <label for="desc">TrvellingDescription:</label>
	 <input type="text" class="form-control" id="desc" name="desc">
	<div class="container">
	 <p class="text-muted">Please enter  description.</p>
	 </div>
	 
 </div> <button type="submit" id = "btnLogin" class="btn btn-default">Submit</button>
 
</form>
</div>

</body>
</html>