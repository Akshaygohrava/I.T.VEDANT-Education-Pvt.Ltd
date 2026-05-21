package Collections;

class A  <T> {
	void details(T obj) {
		System.out.println(obj);
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A<Integer> a = new A<Integer>();
		
		a.details(12);
		
		A<Double> a2 = new A<Double>();
		a2.details(34.67);

	}

}
