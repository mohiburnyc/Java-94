<body>
 <jsp:useBean id="emp" class="co.edureka.web.model.Employee"></jsp:useBean>
 <jsp:setProperty property="*" name="emp"/>
 <h2>
  Employee ID = <jsp:getProperty property="employeeId" name="emp"/><br>
  Employee Name = <jsp:getProperty property="employeeName" name="emp"/><br>
  Employee Salary = <jsp:getProperty property="employeeSal" name="emp"/><br>
 </h2>
</body>