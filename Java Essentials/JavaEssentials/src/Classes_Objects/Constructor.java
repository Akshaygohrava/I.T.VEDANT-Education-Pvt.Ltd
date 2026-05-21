package Classes_Objects;

class DemoClass {
	
// Constructor In Java ,is Special type of Method ,Automatically Called when Class Object is Created !
//	Default , Paramterised , Non-Parameterised Constructors in Java
//	Constructor, Non-Para 
	// Constructor name must same as class name !
	DemoClass() {
		System.out.println("This is Constructor !");
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//        Whatever is the Class name, will be Constructor Name !
//		Constructor will automatically call, When Object is Created !
		
		DemoClass obj = new DemoClass(); 
//		Object Created , Constructor is Called !
		
		
		
		
//		Objects in Constructors 
		ConstructorBook books = new ConstructorBook(101, "Atomic Habbits", 950);		
		System.out.println(books.bookId);
		System.out.println(books.bookName);
		System.out.println(books.price);
		
		
		

	}

}
