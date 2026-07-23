package PracticeSection;

import java.math.BigInteger;

public class Practice {

	public static void main(String[] args) {
		
		// Demo String, Array , Number for Practicing ...
		
		String name = "Akshay";
		String fullname = "Akshay Gohrava";
		
		StringBuilder brother = new StringBuilder("ArjunGohrava");
		
		int[] marks = {45, 55, 41, 65, 44, 78, 87, 65, 40};
		
		String[] fruits = {"Mango", "Apple", "Oranger", "PineApple", "Banana"};
		
		long number = 8452070571L;
		
		int num = 321465;
		
		
		// Find lowest number from number from array ...
		
		int low = marks[0];
		
		for(int i : marks) {
			if(i < low) {
				low = i;
			}
		}
		
		System.out.println("Lowest number :" + low);
		
		for(int odd : marks) {
			if(odd % 2 != 0) {
				System.out.println("Odd Numbers : "+odd);
			}
		}
	
	
		
		
		

	}
}
