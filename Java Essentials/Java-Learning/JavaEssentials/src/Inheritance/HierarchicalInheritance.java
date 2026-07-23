package Inheritance;

class Employee {
	int id;
	String name;
	String joiningDate;
	
	public Employee(int id, String name, String joiningDate) {
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
	}
}

class FullTimeEmployee extends Employee {
	int salary;
	String mediclaimNo;
	int numberofleaves;
	
	public FullTimeEmployee(int id, String name, String joiningDate, int salary, String mediclaimNo, int numberofleaves) {
		super(id, name, joiningDate);
		this.salary = salary;
		this.mediclaimNo = mediclaimNo;
		this.numberofleaves = numberofleaves;
	}
}

class FreelancerEmployee extends Employee {
	int visitPay;

	public FreelancerEmployee(int id, String name, String joiningDate, int visitPay) {
		super(id, name, joiningDate);
		this.visitPay = visitPay;
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		FullTimeEmployee obj = new FullTimeEmployee(101, "Akshay Gohrava", "May 2024", 50000, "Health Insurance", 9);
		
		System.out.println("ID: " + obj.id);
		System.out.println("Name: " + obj.name);
		System.out.println("Joining Date: " + obj.joiningDate);
		System.out.println("Salary: " + obj.salary);
		System.out.println("Mediclaim No: " + obj.mediclaimNo);
		System.out.println("Number of Leaves: " + obj.numberofleaves);
	}
}