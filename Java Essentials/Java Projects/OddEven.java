import java.util.Scanner;

public class OddEven {

     public static void main(String[] args) {
        System.out.println("Hello, Akshay Gohrava !");

        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Number is Odd !");
            
        } else {
            System.out.println(num + " Number is Even !");
        }

    

        


     }

}