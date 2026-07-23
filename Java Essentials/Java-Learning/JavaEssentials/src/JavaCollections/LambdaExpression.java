//package JavaCollections;  // Lowercase package name
//
//@FunctionalInterface 
//interface I1 {
//    void display(String n);
//}
//
//@FunctionalInterface
//interface I2 {
//    void printNumber(int n);
//}
//
//interface I3 {
//    int add(int a, int b);
//}
//
//public class LambdaExpression {
//    public static void main(String[] args) {
//        
//        // Lambda Expression for I1
//        I1 obj = (String n) -> {
//            System.out.println(n);
//        };
//        obj.display("hi");
//    
//        // Lambda Expression for I2 (first example)
//        I2 obj1 = (int n) -> {
//            System.out.println(n);
//        };
//        obj1.printNumber(45);
//        
//        // Lambda Expression for I2 (second example with loop)
//        I2 obj2 = (int n) -> {
//            for(int i = 1; i <= 10; i++) {
//                System.out.println(n);
//            }
//        };
//        obj2.printNumber(6);
//        
//        // Lambda Expression for I3
//        I3 obj3 = (int a, int b) -> {
//            return a + b;
//        };
//        int result = obj3.add(10, 20);
//        System.out.println("Sum: " + result);
//    }
//}