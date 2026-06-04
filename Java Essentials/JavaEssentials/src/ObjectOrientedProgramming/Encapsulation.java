package ObjectOrientedProgramming;

// Different Ways to Achieve Encapsulation

//Way 1: With getters/setters (full access)
 class Employee {
 private String name;
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }
}

//Way 2: Read-only encapsulation
 class ReadOnlyUser {
 private String id = "ABC123";
 public String getId() { return id; }  // No setter
}

//Way 3: Write-only encapsulation (rare)
 class Logger {
 private String logData;
 public void addLog(String message) {  // No getter
     logData += message;
 }
}

//Way 4: Behavior-based (no direct get/set)
 class Thermostat {
 private int temperature = 22;
 
 public void warmer() { temperature++; }  // No direct get/set
 public void cooler() { temperature--; }
 public boolean isHot() { return temperature > 25; }
}

 
 
 
 
 
 
 
 
 
 // Creating Private Variables , Then Access, modify it using getter and setter methods, is called Encapulation
 class Test {
	 private String name = "Akshay";
	 private int age = 24;
	 protected String address = "Walkeshwar";
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	// for Age
	 
	 public void setAge(int age) {
		  this.age = age;
	 }
	 
	 public int getAge() {
		 return this.age;
	 }
	 
	 
 }

 
public class Encapsulation {

	public static void main(String[] args) {
		// Creating getter . setter methods , same name as variables e.g getName(), setName(), getAge(),setAge() 
		
		
		System.out.println("Learning Encapsulation !");
		
		
		Test obj = new Test();
		
		
		System.out.println(obj.getName());
		
		obj.setName("Gohrava");
		
		System.out.println(obj.getName());
		
		System.out.println("I M " + obj.getAge() + " Year Old!");
		
		
		
		
		
		
		
		
//	         	Encapsulation = Data Hiding + Data Binding
//      Binding data and methods together while restricting direct access to fields, typically using private variables and public getters/setters.
//				Yes, you're correct! Encapsulation has two main components:
//
//				1. Data Hiding (Using private) ,	Hide data
//				Hiding internal data from outside access
//
//				Prevents direct manipulation
//
//				2. Data Binding (Grouping related things together)
//				Bundling data (variables) and methods that operate on that data into a single unit (class)
//
//				Getter/Setter are just a MEANS to achieve encapsulation, not encapsulation itself
		
		// Hides Data using , making it privates ,and Access it using getter and setter methods.....
		
		
		// Solution :- Encapsulation = Hide data (private) + Controlled access (getters/setters) = PROTECT DATA Integrety
		// Increase security & integrity 
		
		
		
		// Encapsulation in Java is a mechanism of wrapping data (variables) and code (methods) together as a single unit,
		// while hiding the internal details by making variables private and providing controlled access via public getter and setter methods.
       // private, public (getters/setters)
	}

}




