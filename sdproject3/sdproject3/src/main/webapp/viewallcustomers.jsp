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
  <li><a class="active"  href="viewallcustomers">View All Customers</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Customers</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>ContactNo</th>
<th>Date of Birth</th>
<th>Email ID</th>
<th>Gender</th>
<th>Name</th>
<th>Username</th>
<th>Action</th>

</tr>

<c:forEach items="${custlist}" var="cust">

<tr>

<td> <c:out value="${cust.id}"></c:out>   </td>
<td> <c:out value="${cust.contactno}"></c:out>   </td>
<td> <c:out value="${cust.dateofbirth}"></c:out>   </td>
<td> <c:out value="${cust.emailid}"></c:out>   </td>
<td> <c:out value="${cust.gender}"></c:out>   </td>
<td> <c:out value="${cust.name}"></c:out>   </td>
<td> <c:out value="${cust.username}"></c:out>   </td>
<td> 

<a href='<c:url value='deletecust?id=${cust.id}'></c:url>'>Delete</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
