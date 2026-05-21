package MultipleInheritance;


interface I1 {
	void method1();
	void display();
}

interface I2 {
	void method1();
	void methodI2();
}

class C implements I1, I2 {

	@Override
	public void methodI2() {
		// TODO Auto-generated method stub
		System.out.println("Method Iterface 2");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           C obj = new C();
           obj.display();
           obj.method1();
           obj.methodI2();
	}

}
