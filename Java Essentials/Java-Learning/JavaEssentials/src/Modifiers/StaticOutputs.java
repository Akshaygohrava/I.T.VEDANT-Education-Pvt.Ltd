package Modifiers;

public class StaticOutputs {

	// Static Members Uses Memory Only Once ....
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		StaticCounter c1 = new StaticCounter();
		StaticCounter c2 = new StaticCounter();
		StaticCounter c3 = new StaticCounter();
		
//		System.out.println(c1.count);
//		System.out.println(c2.count);
//		System.out.println(c3.count);        Access Static methods and Variables ,with Class Name , ClassName.variable Or variable()	
		// Static Members Uses Memory Only Once ....
		// In Static Methods, Non static Values is not allowed!
		// static method, variable, static block 
		
		System.out.println(StaticCounter.count);
		
		
		
		System.out.println("*********************************************");
		
		StaticEmployee employee1 = new StaticEmployee();
		employee1.id = 101;
		employee1.name = "Nisha";
		
		System.out.println(employee1.id + " " + employee1.name + " " +  employee1.managerName);
		
		StaticEmployee employee2 = new StaticEmployee();
		employee2.id = 102;
		employee2.name = "Ankita";
		System.out.println(employee2.id + " " + employee2.name + " " +  employee2.managerName);
		
		
		
	}

}
