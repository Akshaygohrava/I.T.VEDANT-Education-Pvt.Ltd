package ExceptionHandling;

public class NagativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age = 18;
      if(age < 19) 
    	throw new NagativeNumberException("Age Cannot be NAgative !");
    	
    	System.out.println("Age is : " + age);
    	
    	
    	
    	
    	// Creating New / Custom Exception and Throw it here , Like NagativeNumberException ......
      
      
	}

}
