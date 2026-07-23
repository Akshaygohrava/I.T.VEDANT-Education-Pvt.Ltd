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
	    		System.out.print(i + ",");
	    	}
	    }
	    
	    
	    
	    // Revising Multi Demension Array ...
	    
	    int age[][] = {
	    		{12, 34, 45, 65},
	    		{21, 23, 41, 62}
	    };
	    
	    for(int q[] : age) {
	    	for(int b : q) {
	    		System.out.print(b + ",");
	    	}
	    }
	    
	    
	    
	    

	}

}
