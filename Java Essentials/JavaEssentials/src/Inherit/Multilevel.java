package Inherit;

class GrandParents {
	void grandp() {
		System.out.println("GrandParents Method");
	}
}

class Parents extends GrandParents {
	void parents() {
		System.out.println("Parents Method");
	}
}
class Child extends Parents {
	void child() {
		System.out.println("Child Method");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.grandp();
		obj.parents();
		obj.child();
		  

	}

}
