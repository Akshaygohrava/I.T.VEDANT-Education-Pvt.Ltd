package StringExamples;

public class StringPractices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// String out , charcter from dot "." into two string
		String fileName[] = {"nature.png", "flower.jpg"};	

	   for(String Char : fileName) {
		   System.out.println(Char.substring(0, Char.indexOf(".")));   // prints: nature, flower
			System.out.println(Char.substring(Char.indexOf(".")));      // prints: .png, .jpg
	   }
	

  }

}