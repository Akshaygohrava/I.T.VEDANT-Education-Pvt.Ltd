package Inherit;

class Dog {
	void bark() {
		System.out.println("Dog Barks !");
		
	}
}

class Cat extends Dog {
	void mew() {
		System.out.println("Cat Mew !");
	}
}
public class SingleInherit {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.bark();
		

	}

}
