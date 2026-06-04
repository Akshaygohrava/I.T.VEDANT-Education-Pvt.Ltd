package JavaCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import java.util.ArrayList;

public class StreamAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StreamApi and Optional Container 
		
		List<Integer> list = Arrays.asList(12, 56, 90, 100);
		
		Optional<Integer> first = list.stream().findFirst();
		
		System.out.println(first);
		System.out.println(first.get());
		
		
		System.out.println("=================");
		
		System.out.println(Arrays.asList(34).stream().findFirst().get());
		
		
		
		System.out.println("============ Custom Exception , Error, If the List is Empty !");
		
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		arraylist.add(23);
		arraylist.add(59);   // Comment this and see 
		arraylist.add(100);
		
		
		Integer i = arraylist
				.stream()
				.findFirst()
				.orElseThrow(() -> new ArithmeticException("List Is Empty, Please Add It "));		
		
		System.out.println(i);
		
		
		
		
		
		
		
		
		
          
	}

}
