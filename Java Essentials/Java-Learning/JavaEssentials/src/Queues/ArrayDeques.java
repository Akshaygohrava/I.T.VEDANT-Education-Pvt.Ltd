package Queues;

import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(12);
		deque.add(19);
		deque.add(16);
		deque.add(30);
		deque.add(20);
		deque.addFirst(120);
		deque.addLast(300);
		
		System.out.println(deque);
		
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		
		System.out.println(deque.pollLast());
		System.out.println(deque);
		
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
	}

}
