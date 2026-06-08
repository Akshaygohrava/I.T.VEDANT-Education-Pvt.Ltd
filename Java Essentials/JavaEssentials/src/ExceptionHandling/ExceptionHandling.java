package ExceptionHandling;

public class ExceptionHandling {
	

	public static void main(String[] args) throws Exception {
		
//		Exception Handling in Java
//		Exception Handling in Java is a mechanism used to handle runtime errors and compile-time issues,
//		ensuring the normal flow of application execution.
//
//		Types of Exceptions in Java
//		1. Checked Exceptions (Compile-Time Exceptions)
//		These are exceptions that are checked at compile time.
//		The compiler forces you to handle them (using try-catch or throws)
//		Examples: IOException, SQLException, ClassNotFoundException
//
//		2. Unchecked Exceptions (Runtime Exceptions)
//		These are exceptions that occur at runtime and are not checked by the compiler.
//		They are caused by programming errors (logic mistakes, improper use of APIs).
//		Examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Throwing Custom Exceptions
//		You can explicitly throw an exception using the throw keyword:
//		// throw new Exception("Custom error message");
		
		
//		Key Points
//		try-catch – Handle exceptions gracefully
//
//		finally – Execute code regardless of exception occurrence
//
//		throw – Explicitly throw an exception
//
//		throws – Declare that a method may throw an exception
		
		
		
		
	}

}
