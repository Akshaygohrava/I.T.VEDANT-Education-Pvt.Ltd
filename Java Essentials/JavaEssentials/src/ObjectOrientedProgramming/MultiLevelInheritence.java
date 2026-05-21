package ObjectOrientedProgramming;


class A {
	void methodA() {
		System.out.println("Method From A Class !");
	}
}

class B extends A {
	void methodB() {
		System.out.println("Method From B Class !");
	}
}

class C extends B {
	void methodC() {
		System.out.println("Method From C Class !");
	}	
}

class D extends C {
	void methodD() {
		System.out.println("Method From D Class !");
	}
}

// Multiple Inheritence , Go in Flow, A B C D ...., So FInal D Class , can access All methods and properites access !

public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Object Creation
		D obj = new D();
		
		// Now i Can Access , all above methods...
		
		obj.methodA();
		obj.methodB();
		obj.methodC();
		obj.methodD();
		
	}

}


































