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
<form action="Book.jsp" method="get">
BookId:
<input type="text" name="bookId"/><br/><br/>

RoomId:
<input type="text" name="roomId"/><br/><br/>


Customer Name:
<input type="text" name="custName"/><br/><br/>

City:
<input type="text" name="city"/><br/><br/>

BookDate:
<input type="text" name="BookDate"/><br/><br/>

ChkInDate:
<input type="text" name="ChkInDate"/><br/><br/>

ChkOutDate:
<input type="text" name="ChkOutDate"/><br/><br/>

<input type="submit" value="Book"/>

</form>

</body>
</html>