package Classes_Objects;

class Students {
	int Id;
	String Name;
	int Marks;
}

class Bank {
	int Bank_id;
	String Name;
	String Manager;
	String Address;
	
}

public class ClassesandObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String text = "This is Lecture of Classes and Objects !"; 
         
         Students obj = new Students();  // Object Creation
         
         obj.Id = 1;
         obj.Name = "Akshay";
         obj.Marks = 78;
         
         System.out.println(obj.Id);
         System.out.println(obj.Name);
         System.out.println(obj.Marks);
         
         Students S2 = new Students();
         
         
         S2.Id = 2;
         S2.Name = "Nisha";
         S2.Marks = 65;
         
         System.out.println(S2.Id);
         System.out.println(S2.Name);
         System.out.println(S2.Marks);
         
         
         //  Banks Class & Objects 
         
         Bank B1 = new Bank();
         B1.Bank_id = 101;
         B1.Name = "SBI BANK";
         B1.Manager = "Akshay Gohrava";
         B1.Address = "Malabar Hill";
         
         System.out.println(B1.Bank_id);
         System.out.println(B1.Name);
         System.out.println(B1.Manager);
         System.out.println(B1.Address);
         
         
	}

}
