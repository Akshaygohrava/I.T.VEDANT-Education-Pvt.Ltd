package JavaCollections;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		List<Integer> list = Arrays.asList(12,23,56,100,9);
		
		list.stream()
		.forEach(n -> System.out.println(n));
		
		// Creating New Stream ...
		
		list.stream()
		.map(n -> n *n)
		.forEach(n -> System.out.println(n));
		
		List<Integer> squares = list.stream()
		.map(n -> n * n)
		.toList();
		System.out.println(squares);
		
		
		
	}

}
