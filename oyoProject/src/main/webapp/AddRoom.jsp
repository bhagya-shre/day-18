<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp"/><br/>
	<jsp:useBean id="beanDao" class="com.infinite.oyoProject.oyoDAO"/>
	<c:set var="user" value="${sessionScope.user}"/>
	<br/> Add Rooms <br/> 
	
		<form action="AddRoom.jsp" method="get">
		<table border="3" align="center">
		<tr>
		<th> Room Type</th>
		<td><input type="text" name="type"/></td>
		</tr>
		
		<tr>
		<th>CostPerDay</th>
		<td><input type="number" name="CostPerDay"/></td>
		</tr>
		
		<tr>
		<th>Status</th>
		<td>
		<select name="Status">
		<option value="AVAILABLE"> Available</option>
		<option value="BOOKED"> Booked</option>
		</select>
		</td>
		</tr>
		
		
		</table>
		 <input type='submit' value='AddRoom' >
		 </form>
</body>
</html>