package JavaCollections;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class StreamAPI5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 

		List<Integer> list = Arrays.asList(12, 34, 35, 45, 56, 78, 88, 100);
		
		System.out.println(list.stream().anyMatch((n) -> n == 100));
		
		System.out.println(list.stream().allMatch((n) -> n == 100));
		
		System.out.println(list.stream().anyMatch((n) -> n < 100));
		
		System.out.println(list.stream().anyMatch((n) -> n > 45));
		
	}

}
