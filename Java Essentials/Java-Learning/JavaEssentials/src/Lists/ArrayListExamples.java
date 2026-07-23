package Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Mango");  // Add An Element
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);
		fruits.add(0, "Orange");  //Add Element At Specific Index
		
		
		System.out.println(fruits);
		
		Collections.sort(fruits); // Sort an String Array
		System.out.println("Sorted Alpha : " +fruits);
		
		Collections.sort(fruits, Collections.reverseOrder()); // Sort in Reverse Order 
		System.out.println("Sorted in Reverse "+fruits); 
		
		System.out.println(fruits.get(2)); // Get An Element
		fruits.set(3, "PineApple");  // Set , Update an Element
		fruits.remove(2);          // Remove Specific Element
		System.out.println(fruits);
		fruits.clear();     // Clear All Element
		System.out.println(fruits);
		
		
		
		
		
        
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(20);
		number.add(20);
		number.add(100);
		number.add(100);
		System.out.println(number); // 20,20 ,100,100
		
		
		
		// Now Find Distinct Values
		HashSet<Integer> hashSet = new HashSet<Integer>(number);
		System.out.println(hashSet); // 20, 100
		
		
		int[] nums = {22,34, 31, 30, 22, 34, 30};
		System.out.println("Length of Array :"+ nums.length);
		
		HashSet<Integer> num2 = new HashSet<Integer>();
		
		for(int a : nums) {
			num2.add(a);
		}
		System.out.println("Length of HashSet Array , Dublicates Not Allowed:"+ num2.size());
		
		
		
		
		
	}

}
