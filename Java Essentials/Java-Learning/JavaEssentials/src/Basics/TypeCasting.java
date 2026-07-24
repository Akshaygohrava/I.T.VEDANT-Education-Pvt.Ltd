public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting in Java
           
        // wideing typecasting .... small to big datatyupe 

        byte a = 12;
        int b = a;
        long c = b;

        System.out.println("Type Casting : "+a + " " + b + " " + c);


        
        // Narrowing Typecasting .... big to small
        int p = 90;
        short q = (short)p;  // int to short conversion ....
        byte r = (byte)q;
        System.out.println(p + " " + q + " " + r);




    }
}
