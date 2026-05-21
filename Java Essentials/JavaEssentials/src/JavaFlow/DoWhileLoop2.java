package JavaFlow;
import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Positive Numbers : ");
		
		int n;
		int sum = 0;
		
		do {
			n = sc.nextInt();
			sum = sum + n;
		}
		while(n > 0);
     System.out.println("Sum is : " + sum);
	}

}
