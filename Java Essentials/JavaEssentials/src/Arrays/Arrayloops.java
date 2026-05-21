package Arrays;

public class Arrayloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		
		a[0] = 43;
		a[1] = 23;
		a[2] = 21;
		a[3] = 78;
		
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for(int n : a) {
			System.out.println(n);
		}
		
		String names[] = {"Nisha", "Ishika", "Manisha"};
		
		for(String n : names) {
			System.out.println(n);
		}
		
	}
}
