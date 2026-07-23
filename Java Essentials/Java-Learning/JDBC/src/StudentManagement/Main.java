package StudentManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		StudentDAO studentdao = new StudentDAO();
		
		while(true) {
			
			System.out.println("================= Welcome ==============");
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Search Student");
			System.out.println("6. Exit");
			
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student Details");
				System.out.println("ID : ");
				int id = sc.nextInt();
				
				System.out.println("Name : ");
				String name = sc.next();
				
				System.out.println("City :");
				String city = sc.next();
				
				Student student  = new Student(id, name, city);
				
				studentdao.addStudent(student);
				
				System.out.println("Student Added !");
			    	
			
				
				break;
				
			case 2:
				studentdao.viewStudents();
			    break;
			
			case 3:
				System.out.println("Enter Id to Update");
				int sId = sc.nextInt();
				
				System.out.println("Enter new City");
				String newCity = sc.next();
				
				StudentDAO.updateStudent(sId, newCity);
						break;
				
			case 4:
				System.out.println("Enter ID to Delete !");
				int idToDelete = sc.nextInt();
				studentdao.deleteStudent(idToDelete);
				break;
				
			case 5:
				System.out.println("Enter ID");
				int searchId = sc.nextInt();
				studentdao.searchStudent(searchId);
				break;
				
				
			case 6:
				System.out.println("Thank You !!!");
				System.exit(0);
				
			default:
				System.out.println("Hello");
			}
		} 
		 
		//  Create Porject Based On JDBC , like CRUD FOR Ecommerece or MultiThreading For Java Mock Project !
		
		
	}
}