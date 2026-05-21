package JavaFlow;
import java.util.Scanner;

public class AdditionLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 Numbers :");
        
        int sum = 0;
        
        for(int i = 1; i <= 5; i++) {
        	int n = sc.nextInt();
        	sum = sum + n;
        }
		  System.out.println("The Sum is :" + sum);
		
		
	}

}
