package JavaCollections;

public class CollectionInJava {

	public static void main(String[] args) {

		// Java Collection Framework is a framework that provides a unified architecture for storing and manipulating groups of objects, 
		
		// Generics is a feature that enables type safety by allowing classes, interfaces, and methods to operate on parameterized types, 
		// eliminating the need for explicit casting and catching type errors at compile time.



		// Lists (Ordered, allows duplicates, index-based access)

//		      Arraylist - Fast random access, slower insert/delete in middle
//		      LinkedList - Faster insert/delete, slower random access
//		      Vector -> Stack - LIFO (Last In First Out)

		// Sets (No duplicates, unordered/ordered based on implementation)

//		      HashSet - No order, O(1) operations
//		      LinkedHashSet - Maintains insertion order
//		      TreeSet - Sorted order (Red-Black tree), O(log n)

		// Queue - FIFO (First In First Out) Ex: Printer, First request, then first print, then seconds
//		      PriorityQueue - Elements processed based on priority
//		      ArrayDeque - Resizable array, faster than LinkedList for queue operations

		// Deque (Double Ended Queue) - Can add/remove from both ends
//		      ArrayDeque
//		      LinkedList (also implements Deque)

		// Maps (Key-Value pairs - NOT part of Collection interface but part of framework)

//		      HashMap - No order, allows null keys/values
//		      LinkedHashMap - Maintains insertion order
//		      Hashtable - Thread-safe, no null keys/values
//		      TreeMap - Sorted by keys
//		      ConcurrentHashMap - Thread-safe with better performance

		// Stream API - For functional-style operations on collections

//		      Intermediate Operations (return Stream)
//		      - filter() - Select elements matching predicate
//		      - map() - Transform each element
//		      - flatMap() - Flatten nested structures
//		      - sorted() - Sort elements
//		      - distinct() - Remove duplicates
//		      - limit() - Limit size
//		      - skip() - Skip first n elements
//		      - peek() - Debug/perform action

//		      Terminal Operations (produce result)
//		      - forEach() - Perform action for each
//		      - collect() - Collect into collection
//		      - toList() - Collect into List (Java 16+)
//		      - reduce() - Combine elements
//		      - count() - Count elements
//		      - anyMatch()/allMatch()/noneMatch() - Check conditions
//		      - findFirst()/findAny() - Find elements
//		      - min()/max() - Find min/max

		// Example usage:
		/*
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		// Filter and collect
		List<String> longNames = names.stream()
		    .filter(name -> name.length() > 4)
		    .collect(Collectors.toList());

		// Map and sort
		List<Integer> nameLengths = names.stream()
		    .map(String::length)
		    .sorted()
		    .collect(Collectors.toList());

		// Reduce operation
		String concatenated = names.stream()
		    .reduce("", (a, b) -> a + " " + b);
		*/
	}

}
