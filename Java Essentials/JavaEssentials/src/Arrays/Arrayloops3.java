package Arrays;

public class Arrayloops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {11, 23, 32, 54, 67, 12, 19, 88};
       
       System.out.println("Enter Numbers");
       System.out.println("Even Numbers from Arrays :");
       
       for(int n : a) {
    	   if(n%2 == 0) {
    		   System.out.println(n);
    	   }
       }
       
       int b[] = {12, -10, 56, -76, -45, 32,-21, 19};
       
       System.out.println("Positives Numbers");
       int positive = 0;
       for(int n : b) {
    	   if(n>0) {
    		   System.out.println(n);
    		   positive++;
    	   }
       }

       System.out.println("Total Positives :" + positive);

       
       
       
       
       

	}

}
