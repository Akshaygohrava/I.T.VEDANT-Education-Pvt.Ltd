package Loops;
import java.util.Scanner;
public class numberprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number: ");
     
     int n = sc.nextInt();
     
     int digit = 0;
     while(n > 0) {
    	 n = n/10;
    	 digit++;
     }
     
     System.out.println(digit);
     
	}
}
