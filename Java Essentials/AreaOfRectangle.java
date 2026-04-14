import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // for taking in for input

        System.out.println("Enter Length : ");
        int length = sc.nextInt();

        System.out.println("Enter Breath : ");
        int breath = sc.nextInt();

        System.out.println("Area of Rectangle is :  " + (length * breath));

        // if (l == b) {
        //     System.out.println("Its is square");
        // } else {
        //     System.out.println("");
        // }

    }
}
