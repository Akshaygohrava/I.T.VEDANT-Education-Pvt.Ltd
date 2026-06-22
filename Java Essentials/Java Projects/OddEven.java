import java.util.Scanner;

public class OddEven {

     public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an Number : ");
        int num = obj.nextInt();
        if (num % 2 == 0) {
            System.out.println("The Number " + num  + " is Even");
        } else {
            System.out.println("The Number " + num  + " is Odd");
        }

        
     }

}

