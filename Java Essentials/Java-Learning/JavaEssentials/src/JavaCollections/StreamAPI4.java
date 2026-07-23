package JavaCollections;

import java.util.ArrayList;
import java.util.Optional;

public class StreamAPI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		
		list.stream().forEach(n -> System.out.println(n));		
		
		Optional<Integer> obj = list.stream().findAny();
		Optional<Integer> obj2 = list.parallelStream().findAny();
		
		System.out.println(obj);
		System.out.println(obj2);
		
		
		
		
		
		
		
	}

}
