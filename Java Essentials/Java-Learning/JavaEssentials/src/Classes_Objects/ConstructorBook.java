package Classes_Objects;

public class ConstructorBook {
   
	int bookId;
	String bookName;
	int price;
	
	ConstructorBook() {
		System.out.println("Books Objects Created !");
		
	}
//	Parameterised Constructors
	ConstructorBook(int bookId, String bookName, int price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	

}
