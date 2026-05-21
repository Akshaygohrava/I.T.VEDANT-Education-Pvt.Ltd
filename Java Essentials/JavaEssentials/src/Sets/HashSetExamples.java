package Sets;
import java.util.Scanner;
import java.util.HashSet;

public class HashSetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          HashSet<String> colors = new HashSet<String>();
          
          for(int i = 1;i <= 5;i++) {
        	  colors.add(sc.next().toLowerCase());   // Add 5 different Values , and it will make it distinct
          }
          
          
          System.out.println(colors);
          
	}

}

//input:
//	red
//	red
//	Green
//	green
//	blue
// Output: 	[red, green, blue]