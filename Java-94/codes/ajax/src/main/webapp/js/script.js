var xhr;

function getEmployeeDetails(empno)
{
  xhr = new XMLHttpRequest();
    
  xhr.open("GET", "search?eno="+empno, true);
  xhr.onreadystatechange=stateChanged;
  
  xhr.send();
}

function stateChanged(){
	if(xhr.readyState==4 && xhr.status==200){
		var ename = 'NO MATCH';
		var sal = 'NO MATCH';
		
		var text = xhr.responseText;

		if(text.length > 0){
			var obj = JSON.parse(text); //to convert JSON String to JSON Object
			ename = obj.empname;
			sal = obj.empsal;
		}
		
		document.getElementById("emp_name").innerHTML = ename;
		document.getElementById("emp_sal").innerHTML = sal;			
	}
}