package Abstraction;

//ABSTRACT CLASS: Can only extend ONE
abstract class Animal {
 abstract void eat();
}

abstract class Machine {
 abstract void operate();
}

//This is IMPOSSIBLE - Java doesn't allow it
//class RobotDog extends Animal, Machine { } // ERROR!


//INTERFACE: Can implement MANY
interface Eatable {
 void eat();
}

interface Operable {
 void operate();
}

interface Chargeable {
 void charge();
}

//This WORKS perfectly
class RobotDog implements Eatable, Operable, Chargeable {
 @Override
 public void eat() {
     System.out.println("Robot dog consuming electricity");
 }
 
 @Override
 public void operate() {
     System.out.println("Robot dog patrolling");
 }
 
 @Override
 public void charge() {
     System.out.println("Robot dog charging");
 }
}
public class Interfaces {
   public static void main(String args[]) {
	   System.out.println("This is Interface !");
	   
	   
	   RobotDog obj = new RobotDog();
	   
	   obj.eat();
	   obj.operate();
	   obj.charge();
   }
}
