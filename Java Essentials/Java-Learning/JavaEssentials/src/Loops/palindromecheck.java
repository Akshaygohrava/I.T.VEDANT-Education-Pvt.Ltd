package Loops;
import java.util.Scanner;

public class palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter Number :");
	        
	        int n = sc.nextInt();
	        
	        int rev = 0;
	        int og = n;
	        
	        while(n > 0) {
	        	rev= rev*10 + (n%10);
	        	n =  n / 10;
	        }
	        
	        System.out.println("The Reverse Of Number is : " + rev);
	        if(og == rev) {
	        	System.out.println("The Number " + og + " " + "Is Palindrome");
	        }
	        else {
	        	System.out.println("The Number " + og + " " + "Is Not Palindrome !");
	        }
	}

}
