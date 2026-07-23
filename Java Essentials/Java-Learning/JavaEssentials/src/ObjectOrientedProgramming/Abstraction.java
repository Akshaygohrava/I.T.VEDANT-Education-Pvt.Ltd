package ObjectOrientedProgramming;

//Modern Interface with default, static, and abstract methods
// Variable 
interface Testing {
	static void text() {
		System.out.println("Hello, I M from Interface");
	}
}
abstract class Car {
	 String name = "BMW";
	 int num = 230745;
	 
	 abstract void engine();
	
}

class Driver extends Car {
	public void drive() {
		System.out.println("I Will Drive The Car!");
	}

	@Override
	void engine() {
		System.out.println("This Engine IS Super Power full");
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
	Driver obj = new Driver();
	
	System.out.println("Learning Abstraction");
	
	System.out.println(obj.name);
	
	obj.engine();
	
		

		
		// Abstraction is a fundamental Object-Oriented Programming (OOP) concept that hides implementation details and
		// shows only essential features to the user. It helps manage complexity by focusing on what an object does rather than how it does it.
		
		// Abstraction =  Hide complexity, and show only essential 
		
		
		// Abstraction is Archive Using Abstract Class and Interfaces, 
		// Solution :- Hide complexity,show only essential = Reduce complexity	
		
		// Abstract Class
		// Partial Abstraction
		// Single inherit
		// Have Constructor
		// Abstract and concret methods
		
		
		// Interface
		// 100% Abstraction
		// Multiple Inheritance
		// No Constructor
	    // default , abstarct, static methods
		
//	KEY DIFFERENCES TO REMEMBER
//	Feature	Abstract Class	Interface
//	Constructor	Yes	No
//	Instance Variables	Yes	Only constants (public static final)
//	Method Implementation	Both abstract & concrete	default, static, private methods (Java 8+)
//	Multiple Inheritance	No (single inheritance)	Yes (multiple interfaces)
//	Access Modifiers	Any	public (methods), public static final (variables)
//	Purpose	"IS-A" (common base)	"CAN-DO" (capability)
		
		
//		
//		Simple memory trick:
//
//			Abstraction = "Don't worry HOW" (reduces complexity)
//
//			Encapsulation = "Don't touch MY data" (protects integrity)
//
//			You need both for robust object-oriented design! 🎯
	
//	Golden Rule: If you're thinking "these classes share STATE/FIELDS" → Abstract Class. 
//	If you're thinking "these classes share BEHAVIOR/CAPABILITY" → Interface.



	}

}
