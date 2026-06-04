package StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  // Add this import

public class DBconnection {
       
    public static Connection getConnection() {
    	
    	// This is The Connection ,,, 
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/student_management";
            String username = "root";
            String password = "Qwerty@1234";
            
            connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {  // Add this catch block
            e.printStackTrace();
        }
        
        return connection;
    }
}