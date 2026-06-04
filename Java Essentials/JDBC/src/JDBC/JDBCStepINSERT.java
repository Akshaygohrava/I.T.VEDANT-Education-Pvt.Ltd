package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStepINSERT {

    public static void main(String[] args) {

        // Step 1: Register Driver Class

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection

            String url = "jdbc:mysql://localhost:3306/student_management";
            String username = "root";
            String password = "Qwerty@1234";

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            if (!connection.isClosed()) {
                System.out.println("Connection is open!");
            }
            
            Statement statement = connection.createStatement();
            
            String query = "INSERT INTO student VALUES (102, 'Anisha', 'Dubai'),(103, 'kajal', 'colaba'),(104, 'ankita', 'gujurat')";
            
            int rows = statement.executeUpdate(query);
            
            System.out.println(rows + " rows affected !");
            
            connection.close();
            		
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



// Create this Database and Table in Mysql before 


//select * from student;
//create database student_management;
//create table student (
//id int primary key,
//name varchar(40),
//city varchar(40)
//);