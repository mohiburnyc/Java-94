<%!
 String companyName = "edureka limited"; //instance variable 
 
 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
my company name = <%=companyName %>
<br>
<%="sum = " + add(11,24) %>
</h2>