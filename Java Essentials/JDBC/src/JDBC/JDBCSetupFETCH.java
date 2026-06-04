package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSetupFETCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Register the driver Class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/student_management";
	        String username = "root";
	        String password = "Qwerty@1234";
	        
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
	        // Create Statement Object ...
	        Statement statement = connection.createStatement();
	        
	        // Execute Statement 
	        String sql = "SELECT * FROM student";
	        
	        ResultSet resultSet = statement.executeQuery(sql);
	        
	        System.out.println(resultSet);
	        
	        
	        
//	        resultSet.next();
//	   
//	        resultSet.getInt(1);
//	        resultSet.getString(2);
//	        resultSet.getString(3);
	        
	        // OR
	        
	        while(resultSet.next()) {
	        	System.out.println(resultSet.getInt(1));
	        	System.out.println(resultSet.getString(2));
	        	System.out.println(resultSet.getString(3));
	        	System.out.println("========================");
	        }
	        
	        
	        
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Create Connection
	
        
        


	}

}
