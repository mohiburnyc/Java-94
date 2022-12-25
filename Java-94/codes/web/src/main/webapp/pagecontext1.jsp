<h2>
<%
 String uid = request.getParameter("txt_uid");
 pageContext.setAttribute("uname", uid, PageContext.SESSION_SCOPE);
 out.println("Hello " + uid);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>