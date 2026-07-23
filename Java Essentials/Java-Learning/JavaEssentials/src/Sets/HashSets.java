package Sets;
import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(34);   // in hashSet , Cannot contain duplicates values, null values are allowed 
		hashSet.add(34);
		hashSet.add(57);
		hashSet.add(100);
		hashSet.add(90);
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		
		
	}

}
