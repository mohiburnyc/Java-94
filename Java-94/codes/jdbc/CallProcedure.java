package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CallProcedure {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		CallableStatement cst = con.prepareCall("{call hike_employee_salary(?,?,?)}");
		
		int empno = 101;
		int hike = 10;
		
		cst.setInt(1, empno);
		cst.setInt(2, hike);
		
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("updated salary for employee: "+empno +"= " + cst.getFloat(3));
		
		cst.close();
		con.close();
	}
}