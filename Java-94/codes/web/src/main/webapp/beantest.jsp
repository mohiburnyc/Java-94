<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>beans in JSP</title>
</head>
<body>
 <jsp:useBean id="emp" class="co.edureka.web.model.Employee"></jsp:useBean>
 <h2>
  Employee ID = <jsp:getProperty property="employeeId" name="emp"/><br>
  Employee Name = <jsp:getProperty property="employeeName" name="emp"/><br>
  Employee Salary = <jsp:getProperty property="employeeSal" name="emp"/><br>
  
  <hr>
  <jsp:setProperty property="employeeName" name="emp" value="Sanjay Patil"/>
  Employee Name = <jsp:getProperty property="employeeName" name="emp"/><br>
 </h2>
</body>
</html>