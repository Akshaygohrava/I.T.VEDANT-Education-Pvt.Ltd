package ObjectOrientedProgramming;


class Animal {
	void sound() {
		System.out.println("Animal Sound!");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat Mew mew!");
	}
}
class Dog extends Cat {
	@Override
	void sound() {
		System.out.println("Dog Sounds Bhow bhow!");
	}
}
	

public class Polymorphism {
	public static int num(int a, int b) {
		System.out.println("Hello, Method Overloading !");
		return a + b;
		
	}
	public static int num(int a, int b,int c) {
		System.out.println("Hello, Method Overloading !");
		return a + b + c;
		
	}

	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(num(2,3));
		System.out.println(num(5,8,9));
		
		Dog obj = new Dog();
		
		
//		Polymorphism in Java
//		Polymorphism means "many forms" - the ability of an object to take multiple forms. 
//		It allows one interface to be used for a general class of actions.
		
		// Polymorphism = One name, many forms = Same action, different behaviors
		
//		Two Types of Polymorphism in Java
//		1. Compile-Time Polymorphism (Method Overloading)
//		Same method name, different parameters
//
//		Decided at compile time
//		
//		
//		2. Runtime Polymorphism (Method Overriding)
//		Same method name, same parameters
//
//		Different implementations in subclasses
//
//		Decided at runtime
		
//		POLYMORPHISM = 
//			    One name + Many forms =
//			    Same action + Different behaviors =
//			    FLEXIBILITY + REUSABILITY
//
//			Two types:
//			1. Overloading (Compile-time) - Same class, different params
//			2. Overriding (Runtime) - Different classes, same method



	}

}
