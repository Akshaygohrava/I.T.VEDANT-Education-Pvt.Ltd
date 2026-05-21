package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Types of Exception HAndling
		// Runtime Exception
		// Compile time exception
		// Can throw new Error using throw ezception !
		
		
		
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println(5 /2);
		System.out.println(10 / 3);
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		
		
		System.out.println("*******************************************");
		
		
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		System.out.println(5 /2);
		
		try {
			System.out.println(10 / 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide By Zero");
		}
		System.out.println("Hello, Exception Handling");
		System.out.println("Hello, Exception Handling");
		
		
		
		
	}

}
