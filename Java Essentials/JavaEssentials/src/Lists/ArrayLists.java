package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		// ========== 1. CREATING ARRAYLIST ==========
		System.out.println("========== CREATING ARRAYLIST ==========");
		
		// Method 1: Default constructor (initial capacity 10)
		ArrayList<String> fruits = new ArrayList<String>();
		
		// Method 2: With initial capacity
		ArrayList<Integer> numbers = new ArrayList<Integer>(20);
		
		// Method 3: Using List interface (polymorphism)
		List<Double> decimals = new ArrayList<Double>();
		
		
		// ========== 2. ADDING ELEMENTS ==========
		System.out.println("\n========== ADDING ELEMENTS ==========");
		
		// add() - adds element at the end
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		System.out.println("After adding fruits: " + fruits);
		
		// add(index, element) - adds at specific position
		fruits.add(1, "Grapes");
		System.out.println("After adding Grapes at index 1: " + fruits);
		
		// addAll() - adds another collection
		ArrayList<String> citrusFruits = new ArrayList<String>();
		citrusFruits.add("Lemon");
		citrusFruits.add("Lime");
		fruits.addAll(citrusFruits);
		System.out.println("After adding citrus fruits: " + fruits);
		
		
		// ========== 3. ACCESSING ELEMENTS ==========
		System.out.println("\n========== ACCESSING ELEMENTS ==========");
		
		// get() - get element at specific index
		System.out.println("Element at index 2: " + fruits.get(2));
		
		// size() - get number of elements
		System.out.println("Size of ArrayList: " + fruits.size());
		
		// indexOf() - find first occurrence index
		System.out.println("Index of 'Mango': " + fruits.indexOf("Mango"));
		
		// lastIndexOf() - find last occurrence index
		fruits.add("Apple");
		System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple"));
		
		// contains() - check if element exists
		System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
		System.out.println("Contains 'Watermelon'? " + fruits.contains("Watermelon"));
		
		// isEmpty() - check if empty
		System.out.println("Is fruits empty? " + fruits.isEmpty());
		
		
		// ========== 4. ITERATING THROUGH ARRAYLIST ==========
		System.out.println("\n========== ITERATING THROUGH ARRAYLIST ==========");
		
		// Method 1: Using for loop with index
		System.out.println("Using for loop:");
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println("  Index " + i + ": " + fruits.get(i));
		}
		
		// Method 2: Using enhanced for loop (for-each)
		System.out.println("\nUsing enhanced for loop:");
		for(String fruit : fruits) {
			System.out.println("  " + fruit);
		}
		
		// Method 3: Using Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			System.out.println("  " + iterator.next());
		}
		
		// Method 4: Using forEach with lambda (Java 8+)
		System.out.println("\nUsing forEach with lambda:");
		fruits.forEach(fruit -> System.out.println("  " + fruit));
		
		
		// ========== 5. MODIFYING ELEMENTS ==========
		System.out.println("\n========== MODIFYING ELEMENTS ==========");
		
		// set() - replace element at specific index
		System.out.println("Before set: " + fruits);
		fruits.set(2, "Strawberry");
		System.out.println("After setting index 2 to Strawberry: " + fruits);
		
		
		// ========== 6. REMOVING ELEMENTS ==========
		System.out.println("\n========== REMOVING ELEMENTS ==========");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		System.out.println("Original list: " + numList);
		
		// remove(index) - removes element at specific index and returns it
		int removed = numList.remove(2);
		System.out.println("Removed element at index 2: " + removed);
		System.out.println("After remove(2): " + numList);
		
		// remove(Object) - removes first occurrence of object
		boolean removed2 = numList.remove(Integer.valueOf(40));
		System.out.println("Was 40 removed? " + removed2);
		System.out.println("After remove(40): " + numList);
		
		// removeAll() - removes all elements in another collection
		ArrayList<Integer> toRemove = new ArrayList<Integer>();
		toRemove.add(10);
		toRemove.add(50);
		numList.removeAll(toRemove);
		System.out.println("After removing 10 and 50: " + numList);
		
		// clear() - removes all elements
		numList.clear();
		System.out.println("After clear(): " + numList);
		System.out.println("Is empty? " + numList.isEmpty());
		
		
		// ========== 7. SORTING AND SEARCHING ==========
		System.out.println("\n========== SORTING AND SEARCHING ==========");
		
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		sortList.add(45);
		sortList.add(12);
		sortList.add(89);
		sortList.add(34);
		sortList.add(67);
		sortList.add(23);
		
		System.out.println("Original list: " + sortList);
		
		// Sorting in ascending order
		Collections.sort(sortList);
		System.out.println("After sorting (ascending): " + sortList);
		
		// Sorting in descending order
		Collections.sort(sortList, Collections.reverseOrder());
		System.out.println("After sorting (descending): " + sortList);
		
		// Binary search (requires sorted list)
		Collections.sort(sortList);
		int searchIndex = Collections.binarySearch(sortList, 34);
		System.out.println("Sorted list: " + sortList);
		System.out.println("Index of 34 using binary search: " + searchIndex);
		
		
		// ========== 8. CONVERTING ARRAYLIST TO ARRAY ==========
		System.out.println("\n========== CONVERTING TO ARRAY ==========");
		
		// toArray() - converts to Object array
		Object[] fruitArray = fruits.toArray();
		System.out.print("Object array: ");
		for(Object obj : fruitArray) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
		// toArray(T[] a) - converts to typed array
		String[] fruitStringArray = fruits.toArray(new String[0]);
		System.out.print("String array: ");
		for(String str : fruitStringArray) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		// ========== 9. SUBLIST ==========
		System.out.println("\n========== SUBLIST ==========");
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		colors.add("Orange");
		
		System.out.println("Original colors: " + colors);
		
		// subList(fromIndex, toIndex) - returns view of portion (toIndex exclusive)
		List<String> subColors = colors.subList(1, 4);
		System.out.println("Sublist (index 1 to 3): " + subColors);
		
		// Changes in sublist reflect in original list
		subColors.set(0, "Cyan");
		System.out.println("After modifying sublist: " + colors);
		
		
		// ========== 10. COMPARING ARRAYLISTS ==========
		System.out.println("\n========== COMPARING ARRAYLISTS ==========");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("X");
		list3.add("Y");
		list3.add("Z");
		
		System.out.println("list1 equals list2? " + list1.equals(list2));
		System.out.println("list1 equals list3? " + list1.equals(list3));
		
		
		// ========== 11. PERFORMANCE DEMONSTRATION ==========
		System.out.println("\n========== PERFORMANCE ==========");
		
		// Ensure capacity (improves performance when adding many elements)
		ArrayList<Integer> bigList = new ArrayList<Integer>();
		bigList.ensureCapacity(1000);
		System.out.println("Capacity ensured for 1000 elements");
		
		// Trim to size (reduces memory usage)
		bigList.trimToSize();
		System.out.println("Trimmed to actual size");
		
		
		// ========== 12. WORKING WITH DIFFERENT DATA TYPES ==========
		System.out.println("\n========== DIFFERENT DATA TYPES ==========");
		
		// ArrayList of custom objects
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("John", 20));
		students.add(new Student("Emma", 22));
		students.add(new Student("Mike", 21));
		
		System.out.println("Student list:");
		for(Student s : students) {
			System.out.println("  " + s);
		}
		
		// ArrayList of ArrayList (2D list)
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < 3; i++) {
			matrix.add(new ArrayList<Integer>());
			for(int j = 0; j < 3; j++) {
				matrix.get(i).add(i * 3 + j + 1);
			}
		}
		System.out.println("\n2D ArrayList (matrix):");
		for(ArrayList<Integer> row : matrix) {
			System.out.println("  " + row);
		}
	}
}

// Custom class for demonstration
class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (Age: " + age + ")";
	}
}