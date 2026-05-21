package StringExamples;

public class StringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Problem Solving ... Most Important Topic in All Languages ...
		
		
		
		
		
        // Find Out the Name Start With "A" Char
		String names[] = {"Akshay","Nisha", "Anuradha", "Anjali", "Ketki", "Anisha"};
		
		// System.out.println(names[1]);
		
		// Print the String Names, Starts With "A" , Problem Solving
		
		for(String s : names) {
			if(s.startsWith("A")) {
				System.out.println(s);         // Akshay , Anuradha, Anjali, Anisha 
			}
		}
		
		
		
		
		// Reverse A String 
		
		String name = "Akshay";
		
		
		
		// Make Character out and print , "untitled" and ".png" 
	    String fileName = "untitled.png";
	    System.out.println(fileName.substring(0 , fileName.indexOf(".")));   // untitled 
	    System.out.println(fileName.substring(fileName.indexOf(".")));   // .png
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
	}

}
