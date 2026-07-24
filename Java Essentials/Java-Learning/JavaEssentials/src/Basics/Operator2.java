public class Operator2 {
    public static void main(String[] args) {
        // Relational and Compairison Operator 

        int a = 7;
        int b = 4;
        
        System.out.println("Comparison Operator");

        System.out.println((a > b) ); // true , a is greater than b
        System.out.println(a < b);  // False , a is not greater than b

        System.out.println(a > 7);  //false,  a is not greater , is equal to
        System.out.println(a >= 7);  // True, 
        System.out.println(a <= 8);  //false,

        System.out.println(a == 7); // True , a is 7
        System.out.println(a == 10); // False, a is not equals to 10
        System.out.println(a != 7);  // False , a is 7, not equals to
        System.out.println(a != 5);  // True  , a is not equals to 5


        // Logical Operators in Java
        System.out.println("Logical Operator");

        // AND && , OR || , NOT !
        System.out.println("AND Operator");
        // AND && , All Conditions Must be True to make the True
        System.out.println(true && true); // true
        System.out.println(false && true);  // false
        System.out.println(true && false && true); // false
        System.out.println(10==10 && 5 > 6); // False

        // OR || , Any One Condition True , Then True
        System.out.println("OR Operator");

        System.out.println( true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || false); // False
        System.out.println(false || true); // True
        System.out.println(10 > 4 || 10 != 10); // True 

    //    Ternary Operators

    int x = 3;
    int y = 7;

    int z = x < y ? x : y;
    System.out.println(z);

    // Bitwise Operator 
    //  & | ^

    System.out.println(5&7);   // 5
    // 5 = 101, 7 = 111

    System.out.println(5|7);  // 7

    }
}
