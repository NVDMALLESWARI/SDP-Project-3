<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<style>

.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: green;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}


ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>


<br><br>

<h3 align=center><u>Car Registration</u></h3>

<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>

<br>


<form:form action="addcars" method="post" modelAttribute="car">

<table align=center>

<tr>
<td><label>BuyerType</label></td>
<td>
<form:select path="buyertype" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="New">New</form:option>
<form:option value="Additional">Additional</form:option>
<form:option value="Exchange of old car">Exchange of old car</form:option>
</form:select>
</td>
<tr><td></td></tr>
<tr>
<td><label>City</label></td>
<td>
<form:select path="city" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="Vijayawada">vijayawada</form:option>
<form:option value="Guntur">Guntur</form:option>
<form:option value="JangareddyGudem">JangareddyGudem</form:option>
<form:option value="Khammam">Khammam</form:option>
<form:option value="Visakapatnam">Visakapatnam</form:option>
<form:option value="Tirupati">Tirupati</form:option>
</form:select>
</td>
<tr><td></td></tr>
<tr>
<td><label>Dealer</label></td>
<td>
<form:select path="dealer" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="Mithra Auto Agencies PVT LTD Vijayawada">Mithra Auto Agencies PVT LTD Vijayawada</form:option>
<form:option value="Varun Motors PVT LTD Vijaywada">Varun Motors PVT LTD Vijaywada</form:option>
<form:option value="Santhosh Automotors PVT LTD">Santhosh Automotors PVT LTD</form:option>
<form:option value="JayaLakshmi Automotors PVT LTD Guntur">JayaLakshmi Automotors PVT LTD Guntur</form:option>
<form:option value="Reddy & Reddy Motors">Reddy & Reddy Motors</form:option>
<form:option value="Mithra Autoagencies PVT LTD">Mithra Autoagencies PVT LTD</form:option>
<form:option value="Varun Motors pvt ltd vizag">Varun Motors pvt ltd vizag</form:option>
<form:option value="Vishnu Cars pvt ltd tirupati">Vishnu Cars pvt ltd tirupati</form:option>
</form:select>
</td>
<tr><td></td></tr>
<tr>
<td><label>Email ID</label></td>
<td><form:input path="email" required="required"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Mobile No</label></td>
<td><form:input path="mobileno" required="required"/></td>
</tr>
<tr><td></td></tr>
<tr>
<td><label>Model</label></td>
<td>
<form:select path="model" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="BMW 3 Series">BMW 3 Series</form:option>
<form:option value="Hyundai Venue">Hyundai Venue</form:option>
<form:option value="Audi Q3">Audi Q3</form:option>
<form:option value="Land Rover Defender">Land Rover Defender</form:option>
<form:option value="Maruti Grand Vihara">Maruti Grand Vihara</form:option>
<form:option value="Honda All New City">Honda All New City</form:option>
</form:select>
</td>
<tr><td></td></tr>
<tr>
<td><label>Name</label></td>
<td><form:input path="name" required="required"/></td>
</tr>

<tr><td></td></tr>
<tr>
<td><label>State</label></td>
<td>
<form:select path="state" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="Andhrapradesh">Andhrapradesh</form:option>
<form:option value="Telangana">Telangana</form:option>
</form:select>
</td>
<tr><td></td></tr>


<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td colspan=2><input type="submit" value="Register" class="button"></td>
</tr>

</table>

</form:form>



</body>
</html>

 
