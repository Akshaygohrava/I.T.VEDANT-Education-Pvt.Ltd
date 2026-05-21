package Arrays;

public class MaxMinfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {12, 34, 5, 76, 100, 3, 23};
      
      int max = array[0];
      
      for(int n : array) {
    	  if(n > max) {
    		  max = n;
    	  }
      }
      
      System.out.println("Maximum Array is :" + max);
      
      System.out.println("=========================");

      int min = array[0];
      
      for(int m : array) {
    	  if(m < min) {
    		  min = m;
    	  }
      }
      
      
      System.out.println("Minimum Array Number is :"+ min);

      
      
	}

}
