<%!
 String uid;
 String pwd;
%>

<h2>
<%
 uid = request.getParameter("txt_uid");
 pwd = request.getParameter("txt_pwd");
 
 out.println("user name = " + uid + "<br>");
 out.println("password = " + pwd);
%>
</h2>
<hr>
<h2>
server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
protocol = <%=request.getProtocol() %> <br>
HTTP method = <%=request.getMethod() %> <br>

application name = <%=request.getContextPath() %><br>

content type = <%=request.getContentType() %><br>
content size = <%=request.getContentLength() %>
</h2>