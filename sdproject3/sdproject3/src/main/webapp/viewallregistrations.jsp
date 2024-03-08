<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<style>
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


<br>

<ul>
  <li><a href="adminhome">Home</a></li>
  <li><a href="viewallcustomers">View All Customers</a></li>
  <li><a class="active" href="viewallregistrations">CarRegistrations</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Registrations</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>BuyerType</th>
<th>City</th>
<th>Dealer</th>
<th>Email</th>
<th>Mobileno</th>
<th>model</th>
<th>name</th>
<th>state</th>
<th>Action</th>

</tr>

<c:forEach items="${carlist}" var="car">

<tr>

<td> <c:out value="${car.id}"></c:out>   </td>
<td> <c:out value="${car.buyertype}"></c:out>   </td>
<td> <c:out value="${car.city}"></c:out>   </td>
<td> <c:out value="${car.dealer}"></c:out>   </td>
<td> <c:out value="${car.email}"></c:out>   </td>
<td> <c:out value="${car.mobileno}"></c:out>   </td>
<td> <c:out value="${car.model}"></c:out>   </td>
<td> <c:out value="${car.name}"></c:out>   </td>
<td> <c:out value="${car.state}"></c:out>   </td>
<td> 

<a href='<c:url value='deletecar?id=${car.id}'></c:url>'>Delete</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>
