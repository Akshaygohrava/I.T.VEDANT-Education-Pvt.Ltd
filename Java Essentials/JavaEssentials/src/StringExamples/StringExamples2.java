package StringExamples;

public class StringExamples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         String name = "Akshay";  // 012345
         
         name.toUpperCase();
         System.out.println(name);  // Akshay
         System.out.println(name.concat(" Gohrava")); // Akshay Gohrava 
         System.out.println(name.length()); // 6
         System.out.println(name.isEmpty());  // false, is not empty
         System.out.println(name.toUpperCase());  // AKSHAY
         System.out.println(name.toLowerCase()); // akshay
         System.out.println(name.charAt(0)); // A
         System.out.println(name.indexOf("k"));  // 1 
         System.out.println(name.lastIndexOf("a"));  
         System.out.println(name.replace("kshay", "Gohrava"));  // Agohrava , kshay replace with Gohrava 
         System.out.println(name.equalsIgnoreCase("AksHaY")); // true 
         System.out.println(name.substring(0, 4));  // Aksh
         System.out.println(name.startsWith("A"));  // ? , true
         System.out.println(name.endsWith("B"));  // ?, false
         
		String names[] = {"Akshay","Nisha", "Anuradha", "Anjali", "Ketki", "Anisha"};
		
		System.out.println(names[1]);
		
		
		
		
		
		
	}

}
