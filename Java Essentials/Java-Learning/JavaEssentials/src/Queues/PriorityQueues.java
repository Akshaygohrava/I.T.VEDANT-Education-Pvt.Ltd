package Queues;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
       
       queue.add(23);
       queue.add(2);
       queue.add(19);
       queue.add(17);
       queue.add(13);
       
       System.out.println(queue);
       
       queue.poll();  //Remove the smallest one, each time ...
       queue.remove();
       System.out.println(queue);
       
       queue.poll();  //Remove the smallest one, each time ...
       System.out.println(queue);
       
       System.out.println(queue.peek());
       System.out.println(queue);
       
		
	}

}
