package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Sunil', 2500)";
		String sql = "insert into emp(empno, ename, sal) values (102, 'Abhijith',3500), (103, 'Bharath', 4500.5),"
				+ "(104, 'Sanjay', 5500), (105,'Srinivas',6500), (106, 'Mark',2750.5)";
		
		int n = st.executeUpdate(sql);
		System.out.println("employees saved = " + n);
		
		st.close();
		con.close();
	}

}
