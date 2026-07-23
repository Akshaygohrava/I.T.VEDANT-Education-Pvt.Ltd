package JavaCollections;

import java.util.function.Predicate;

class M implements Predicate<Integer> {

	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return n % 2 == 0;
	}
	
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans = new M().test(5);
		
		System.out.println(ans);
		
		
		

	}

}
