package Modifiers;

final class A {
	public void test() {
		System.out.println("Hello, Final Class");
	}
}

// class B extends A {}   // Final Class cannot inherit

public class NonAccessModifiers {
	
	final void bank() {
		System.out.println("Hello, Bank !");
	}
	// Final Methods cannot overide ...
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Making Class, Methods, and Variable Using Static and Final is Non-Access Modifiers 
		
		
		// Static & Non-Static Examples
		
		
		
		
		// Final Examples 
		
		final String name = "Akshay";
		// name = "Akshay Gohrava";      // final variable cannot reassign
		
		
		
		System.out.println(name);
		
		
		
		
		
	}

}
