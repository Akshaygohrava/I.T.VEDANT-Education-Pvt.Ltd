package ExceptionHandling;


class Demo {
	public void checkElement(int id) throws IdNotFoundException {
		int a[] = {12, 45, 100, 20};
		boolean exists = false;
		
		for(int i : a) {
			if(i == id) {
				exists = true;
			}
		}
		
		if(exists) {
			System.out.println("Element Found : "  + id);
		}
		else {
			throw new IdNotFoundException("Id Not Found !");
		}
		
		
	}
	
	
}
public class IdNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		try {
			obj.checkElement(2);
		} catch (IdNotFoundException e) {
			System.out.println("Element Not Found");
		}
		
		// Creating New / Custom Exception and Throw it here , Like NagativeNumberException ......
	}

}
