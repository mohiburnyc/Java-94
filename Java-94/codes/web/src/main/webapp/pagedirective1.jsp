<%@page import="java.util.Date" info="jsp directive demonstration" language="java" %>
<%!
 Date today;
 %>
 <h2 style="text-align:center">
 <%
  today = new Date();
  out.println(today+"<br>");
  out.println(getServletInfo());
 %>
 </h2>