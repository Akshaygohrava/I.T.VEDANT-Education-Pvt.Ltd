package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// One Dimensional Array 
         int marks[] = {34, 43, 56, 78, 28};
         
         System.out.println(marks.length);
         
         System.out.println(marks[4]);
         
         System.out.println(marks[2]);
         
         System.out.println(marks[2] * 2);  
         
         
         int age[] = {23, 32, 44, 12, 14, 15};
         // Iterate Over Array
         for(int num : age ) {
        	 System.out.print(num + " , ");
         }
         
         System.out.println("");
         
         // Two Dimension Arrays
         String fruits[][] = {
        		 {"Mango", "Apple", "Orange"},
        		 {"Banana", "Grapes","Papaya"}
         };
         System.out.println(fruits[0][2]); // Orange
         System.out.println(fruits[1][1]);  // Grapes
         
        
         
         // String Arrays 
         
         String Days[] = {"Monday","Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
         
         System.out.println("Today is : " + Days[3]);
         
          		 
    
         }

}
