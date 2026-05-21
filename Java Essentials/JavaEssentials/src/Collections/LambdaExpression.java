package Collections;  // Changed to lowercase (convention) and removed conflict with Java class

import java.util.function.Predicate;

@FunctionalInterface 
interface I1 {
	void display(String n);
}

@FunctionalInterface
interface I2 {
	void printNumber(int n);
}

interface I3 {
	int add(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// Functional Interface, which has one abstract method 
		
		// Lambda Expression
		
		I1 obj = (n) -> System.out.println(n);
		obj.display("hi");
	
		
		I2 obj1 = (n) -> System.out.println(n);
		obj1.printNumber(45);
		
		I2 obj2 = (n) -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println(n);
			}
		};
		obj2.printNumber(6);
		
		I3 obj3 = (a, b) -> a + b;
		int result = obj3.add(10, 20);
		System.out.println("Sum: " + result);
	}
}