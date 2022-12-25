<%@page isErrorPage="true" %>
<body bgcolor=lightblue text=red>
<h2>
 <%
   if(exception instanceof ArithmeticException)
	   out.println(exception.toString());
   else if(exception instanceof ArrayIndexOutOfBoundsException)
	   out.println("Error -> " + exception.getMessage());
   else
	   out.println("Internal Server Error");
 %>
</h2>
</body>