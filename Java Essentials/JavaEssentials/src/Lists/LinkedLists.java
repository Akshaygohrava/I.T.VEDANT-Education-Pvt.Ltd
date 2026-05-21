package Lists;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedLists {

	public static void main(String[] args) {
		
		// ========== CREATING LINKEDLIST ==========
		// Use LinkedList (Java's built-in), NOT LinkedLists (your class name)
		LinkedList<String> list = new LinkedList<String>();
		
		// ========== ADDING ELEMENTS ==========
		System.out.println("=== ADDING METHODS ===");
		
		list.add("Apple");           // Adds at end
		list.addFirst("Grapes");     // Adds at beginning
		list.addLast("Mango");       // Adds at end
		list.add(2, "Banana");       // Adds at specific index
		list.offer("Orange");        // Adds at end (Queue method)
		list.offerFirst("Kiwi");     // Adds at beginning
		list.offerLast("Pear");      // Adds at end
		list.push("Peach");          // Adds at beginning (Stack method)
		
		System.out.println("After adding: " + list);
		
		// ========== ACCESSING ELEMENTS ==========
		System.out.println("\n=== ACCESSING METHODS ===");
		
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());
		System.out.println("Element at index 2: " + list.get(2));
		System.out.println("Peek first: " + list.peekFirst());
		System.out.println("Peek last: " + list.peekLast());
		System.out.println("Index of 'Banana': " + list.indexOf("Banana"));
		System.out.println("Contains 'Mango'? " + list.contains("Mango"));
		System.out.println("Size: " + list.size());
		
		// ========== REMOVING ELEMENTS ==========
		System.out.println("\n=== REMOVING METHODS ===");
		
		System.out.println("Remove first: " + list.removeFirst());
		System.out.println("After removeFirst: " + list);
		
		System.out.println("Remove last: " + list.removeLast());
		System.out.println("After removeLast: " + list);
		
		System.out.println("Remove index 1: " + list.remove(1));
		System.out.println("After remove(1): " + list);
		
		System.out.println("Remove 'Orange': " + list.remove("Orange"));
		System.out.println("After remove('Orange'): " + list);
		
		System.out.println("Poll first: " + list.pollFirst());
		System.out.println("After pollFirst: " + list);
		
		System.out.println("Pop: " + list.pop());
		System.out.println("After pop: " + list);
		
		// Clear all
		list.clear();
		System.out.println("After clear: " + list);
		
		// ========== RE-ADDING FOR NEXT EXAMPLES ==========
		list.add("Dog");
		list.add("Cat");
		list.add("Elephant");
		list.add("Lion");
		list.add("Tiger");
		
		// ========== ITERATING METHODS ==========
		System.out.println("\n=== ITERATING METHODS ===");
		
		// Method 1: Enhanced for loop
		System.out.println("Enhanced for loop:");
		for(String item : list) {
			System.out.println("  " + item);
		}
		
		// Method 2: For loop with index
		System.out.println("\nFor loop with index:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("  Index " + i + ": " + list.get(i));
		}
		
		// Method 3: Reverse order
		System.out.println("\nReverse order:");
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println("  Index " + i + ": " + list.get(i));
		}
		
		// ========== MODIFYING ELEMENTS ==========
		System.out.println("\n=== MODIFYING METHODS ===");
		
		System.out.println("Before set: " + list);
		list.set(2, "Giraffe");
		System.out.println("After set(2, 'Giraffe'): " + list);
		
		// ========== SORTING ==========
		System.out.println("\n=== SORTING ===");
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(45);
		numbers.add(12);
		numbers.add(89);
		numbers.add(34);
		numbers.add(67);
		
		System.out.println("Original: " + numbers);
		
		Collections.sort(numbers);
		System.out.println("Ascending: " + numbers);
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Descending: " + numbers);
		
		// ========== LINKEDLIST AS QUEUE (First In First Out) ==========
		System.out.println("\n=== USING AS QUEUE (FIFO) ===");
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("First");
		queue.offer("Second");
		queue.offer("Third");
		
		System.out.println("Queue: " + queue);
		System.out.println("Processing: " + queue.poll());
		System.out.println("Queue after poll: " + queue);
		System.out.println("Processing: " + queue.poll());
		System.out.println("Queue after poll: " + queue);
		
		// ========== LINKEDLIST AS STACK (Last In First Out) ==========
		System.out.println("\n=== USING AS STACK (LIFO) ===");
		
		LinkedList<String> stack = new LinkedList<String>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		System.out.println("Stack: " + stack);
		System.out.println("Processing: " + stack.pop());
		System.out.println("Stack after pop: " + stack);
		System.out.println("Processing: " + stack.pop());
		System.out.println("Stack after pop: " + stack);
	}
}