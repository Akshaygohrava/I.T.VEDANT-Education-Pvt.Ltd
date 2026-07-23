package Sets;
import java.util.TreeSet;


public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(14);
		set.add(45);
		set.add(12);
		set.add(23);
		set.add(45);
	//	set.add(null); // Gives an Error , Cannot accepts null values , called treeSets ...
		
		System.out.println(set);
		
	}

}
