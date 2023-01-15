package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Student;

@Path("/edureka")
public class StudentRegistrationRestController {
	/*
	@POST
	@Produces("text/html")
	@Path("/register")
	public String registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
										@FormParam("addr_field") String address) {
		//--logic to save the student to database
		String response = "<p style=font-size:20px;line-height:2>";
		response += "Name - "+name+"<br>";
		response += "Age - "+age+"<br>";
		response += "Address - "+address+"</p>";
		
		return response;
	}
	*/
	
	@POST
	@Produces("application/json")
	@Path("/register")
	public Student registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
										@FormParam("addr_field") String address) {
		//--logic to save the student to database
		Student student = new Student();
		
		student.setStudentName(name);
		student.setStudentAge(age);
		student.setStudentAddress(address);
		
		return student;
	}
}
