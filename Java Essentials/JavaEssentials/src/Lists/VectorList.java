package Lists;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		
		for(int i = 1; i <= 41; i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());

	}

}