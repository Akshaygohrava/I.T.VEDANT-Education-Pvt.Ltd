import java.util.Scanner;

public class Input {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);  // Creating Input Object


    System.out.println("Enter Your Name: ");
    String Name = sc.nextLine();
    System.out.println("Your Name is :" + Name);


    System.out.println("Enter your Age:");
    int age = sc.nextInt();     // Java Method, to Take inputs

    System.out.println("Your Age is :" + age);

    

          
    }
}