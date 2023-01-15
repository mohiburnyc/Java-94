package co.edureka.services;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/personal")
public class PersonalRestController {
	@GET
	@Produces("text/plain")
	@Path("/age/{name}/{yob}")
	public String calculateAge(@PathParam("name") String name, @PathParam("yob") Integer yob)
	{
		if(isValidYoB(yob)) {
			int age = getAge(yob);
			return "Hello "+name+", you are "+age+ " years of age!!";
		}else {
			return "Hello "+name+", your Year of Birth is NOT Valid";
		}
	}

	private boolean isValidYoB(Integer yob) {
		int currentYear = getCurrentYear();
		boolean isValid = (yob < currentYear)?true:false;
		return isValid;
	}

	private int getCurrentYear() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return year;
	}
	
	private int getAge(Integer yob) {
		return getCurrentYear()-yob;
	}
}
