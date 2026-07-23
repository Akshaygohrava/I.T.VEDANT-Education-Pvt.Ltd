import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        
    // Operators in Java
   Scanner sc = new Scanner(System.in);

    // Addition of Two Number 
    System.out.println("Enter First Number :");
    int num1 = sc.nextInt();

    System.out.println("Enter Second Number :");
    int num2 = sc.nextInt();
    
    System.out.println("Addition of Two Number : " + (num1+num2));

    System.out.println("Subtraction is :" + (num1 - num2));
    System.out.println("Multiplication is :" + (num1 * num2));
    System.out.println("Division is :" + (num1 / num2));
    System.out.println("Modulus is :" + (num1 % num2));


    // Post and pre increment & Decrement

    int a = 10;
    System.out.println("Post increment is :" + (a++));
    System.out.println("Pre increment is :" + (++a));

    System.out.println("Post Decrement is :" + (a--));
    System.out.println("Pre Decrement is :" + (--a));
   

    // Assignment Operators
    int age = 25;
    System.out.println("Now Your Age is : "+ age);
    age+=10;   // add 5 to age variable
    System.out.println("Increase Age by 10 year "+age);
    age-=5;
    System.out.println("Decrease age by 5 "+age); // Minus Age by 5 years
    age*=2;
    System.out.println("Multiply Age by 2 " + age); // Multiply Age by 2




    }
}
