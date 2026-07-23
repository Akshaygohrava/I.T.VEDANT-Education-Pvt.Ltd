package StringExamples;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		// Creating String using String Letrials 
		String Name = "Akshay";   // String Constant pull
		
		// Using New Keywords
		String Surname = new String("Gohrava");   // Heap Memory
		
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2); // true
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s2 == s3);  //False
		System.out.println(s3 == s4);  // false
		
		
		System.out.println("*********************************");
		// Strinf Methods
		
		// Comapre Strings ...
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		// Strings is Muteabble, we cannot modify it
		
		
		
	}

}
