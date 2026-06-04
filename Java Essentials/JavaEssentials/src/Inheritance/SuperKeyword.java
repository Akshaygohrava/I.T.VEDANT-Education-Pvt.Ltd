package Inheritance;

class Parents1 {  // Changed from Parents
    Parents1(String Name) {
        System.out.println(Name);
    }
}

class Child1 extends Parents1 {  // Changed from Child
    Child1() {
        super("Akshay Gohrava");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child1 superkey = new Child1();
    }
}