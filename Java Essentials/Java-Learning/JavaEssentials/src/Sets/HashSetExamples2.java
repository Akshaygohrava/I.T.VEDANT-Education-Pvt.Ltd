package Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExamples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(12);
		set.add(19);
		set.add(34);           // Comment down , another , then see the difference ....
		set.add(10);
		set.add(11);
		set.add(null);
		
		System.out.println(set);
	}

}
