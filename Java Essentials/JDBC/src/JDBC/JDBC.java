package JDBC;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JDBC (Java Database Connectivity) is an java Api , established Connection between Java Application and RDBMS ,
		// Relational Database Management System like MYSQL, ORACLE 
		
           // Download MySQL Connector , Jar file from Maven repository or official 
		// Download  MySQL Connector /J jar file , For Making Connection for JDBC 
		
		//Step - 2
		//After Download mysqk Connector ,  adding JDBC Connector in Your Project 
		// right click on project > Build path > Configure Build path > Select Libaray > click classpath > 
		// > add external jar > select mysql connector jar > apply > apply & close 
		// Now,  MySql connector successfully coonect with Project
		// One new package , created Reference Libraries is created , and mysql-connector jar file is there !
		
		
		
		// Example : Code
		// Connection url  =  jdbc:mysql://localhostLport_no/database-name
		// Username = root
		// Password = root
		
		// Steps To JDBC 
		// > download and add MySql Connector jar file, in Your project, represents the jdbc driver for specific database.
		// > Driver Manager : Establishes a connection to the database
		// > Create Connection : represent session with the database
		// > Statement, Prepared Statement : Used To Execute SQL Query 
		// > Resultset : Hold the data return by sql statement
		// > SQLException , handle all database errorsql error and connection error !
	}

}
