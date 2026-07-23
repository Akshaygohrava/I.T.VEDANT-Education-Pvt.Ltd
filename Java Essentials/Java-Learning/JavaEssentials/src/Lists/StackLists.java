package Lists;
import java.util.Stack;

public class StackLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();           // Creating Class Objects
		
		stack.push(12);
		stack.push(100);
		stack.push(120);
		
		System.out.println(stack);
		
		System.out.println("Popped Element : " + stack.pop());
		
		System.out.println(stack);
		
		System.out.println("Popped Element : " + stack.pop());
		
		System.out.println(stack);
		
		System.out.println("Added Element : " + stack.push(200));
		
		System.out.println(stack);
		
		
		// peak, Shows last added Eleeents
		stack.push(90);
		stack.push(101);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		
		// Stack Methods
		System.out.println(stack.empty());
		System.out.println(stack.search(700));   // -1 for not found, and index return when found
		System.out.println(stack);
		
	
		
	    
		
		
	}

}