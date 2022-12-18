package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(109, 'Sanjay', 2500)");
		st.addBatch("insert into emp values(110, 'Sharath', 2500)");
		//st.addBatch("insert into emp values(109, 'Sanju', 2500)");
		st.addBatch("insert into emp values(111, 'Sanju', 2500)");
		st.addBatch("update emp set sal=2700 where empno>108");
		
		try {
			int[] rowsAffected = st.executeBatch();
			for(int x : rowsAffected) {
				System.out.println("employees affected = " + x);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		st.close();
		con.close();
	}

}
