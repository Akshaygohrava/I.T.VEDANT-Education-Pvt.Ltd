package Inheritance;

class Parents {
	void account() {
		int balance = 2000;
		System.out.println("Balance from Parent Class : " + balance);
	}
	// Creating Constructor ..
	 Parents() {
		 
	 }
	
}

class Child extends Parents {
	  int balance = 1000;
	  
	  Child() {
		  
	  }
}


public class Inheritence {

	public static void main(String[] args) {
		
		// Single , Multi level, Hererical, hybrid, Multiple   are types 5 types of Inheritence .........
		
		// Inheritence In Java, is used to Inherit properties from one class to another, 
		// like child class to parent class .... 
		
		
//		Creating Child Object and Access Parents Properties
		
		Child obj = new Child();
		
		obj.account();
		
		
		// This is Called , Single Inheritence In Java
		
		
		

	}

}
