package Lists;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(20);
		list.add(100);
		list.add(100);
		
		System.out.println(list); // 20,20 ,100,100
		
		// Now Find Distinc Values
		
		HashSet<Integer> hashSet = new HashSet<Integer>(list);
		System.out.println(hashSet); // 20, 100
		
		
		
		
		
	}

}
