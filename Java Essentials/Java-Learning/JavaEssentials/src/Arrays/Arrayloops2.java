package Arrays;
import java.util.Scanner;

public class Arrayloops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[5];
        
		for(int i = 0;i <  marks.length; i++) {
			System.out.println("Enter marks :");
		     marks[i] = sc.nextInt();
		}
		for(int n : marks) {
			System.out.println(n);
		}
		
		int sum = 0;
		for(int n : marks) {
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("The Sum is :" + sum);
		System.out.println("The Average is :" + sum/marks.length);

		
	}

}
