package Sets;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(15);
		set.add(12);
		set.add(19);
		set.add(2);
		set.add(50);
		set.add(14);
		
		System.out.println(set);
		
		// TreeSet Methods
		
		System.out.println(set.lower(19));
		System.out.println(set.headSet(19));
		System.out.println(set.headSet(19, true));
		
		System.out.println(set.higher(14));
		System.out.println(set.tailSet(14));
		System.out.println(set.tailSet(14, false));
		
		System.out.println(set.subSet(2, 19));
		System.out.println(set.subSet(2,  false, 19,true));
		
		System.out.println(set.ceiling(12));
		System.out.println(set.floor(15));
		
		
		
	}

}
