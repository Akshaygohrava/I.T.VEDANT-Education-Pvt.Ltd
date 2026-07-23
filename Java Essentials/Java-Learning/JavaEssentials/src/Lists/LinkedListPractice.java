package Lists;
import java.util.LinkedList;
public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Akshay");
		names.add("Rahul");
		names.add("Deepesh");
		names.add("Ritesh");
		names.add("Nishant");
		names.add("Mandar");
		names.add("Vivek");
		names.add(0, "Arib");
		
		System.out.println(names);
		
		for(String i : names) {
			System.out.println(i);
		}
            
		System.out.println("Get : "+names.get(3));
		
		
	}

}
