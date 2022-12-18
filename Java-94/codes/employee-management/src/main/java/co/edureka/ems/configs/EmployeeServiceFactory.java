package co.edureka.ems.configs;

import co.edureka.ems.services.EmployeeService;
import co.edureka.ems.services.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService service;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(service == null) {
			service = new EmployeeServiceImpl();
		}
		return service;
	}
}
