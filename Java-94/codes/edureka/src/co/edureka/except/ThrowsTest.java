package co.edureka.except;

import java.sql.SQLException;

class UserService{
	public boolean checkUserById(int id) throws SQLException {
		System.out.println("checking user in database");
		return true;
	}
}

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		try {
			boolean status = uService.checkUserById(101);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("please wait for 5 seconds..");
		Thread.sleep(5000); //5000ms - 5seconds
		System.out.println("thanks for waiting");
	}
}