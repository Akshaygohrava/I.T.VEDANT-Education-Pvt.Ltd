package FinalExamples;

class A {    // add final keyword 
	
}
class B extends A {
	
	
}

class P {
	   void display() {
			
		}
	}

	class Q extends P {
		
		void display() {
		   System.out.println("Hello, Overide");	
		}
	}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FInal Keyword 
		
		// Final Class cannot be inherit 
		// final Method Cannot be overude
	    // final Variable cannot be Overwritten
		
		String name = "Akshay";
		
		int age = 18;     // add final
		System.out.println(age);
		age= 15;
		System.out.println(age);
		
		
         
	}

}
