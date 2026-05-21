package Arrays;

public class MultidimensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{11,23,43,33,23, 76, 78},{14, 56,45, 65,78}};
		
		System.out.println(a[1][3]);
		
	    int marks[][] = {{12,34,43,23},{14,23,45,21},{15,12,45,42}};
	    
	    System.out.println(marks[2][2]);
	    
//	    Iterate Over MultiDem Arrays 
	    
	    for(int n[] : marks) {
	    	for(int i : n) {
	    		System.out.println(i);
	    	}
	    }
	    
	    

	}

}
