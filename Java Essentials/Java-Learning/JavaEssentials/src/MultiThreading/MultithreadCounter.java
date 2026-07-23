package MultiThreading;

public class MultithreadCounter {
	
	
    int count = 0;
    
    synchronized public void increment() {         // synchronized Concepts
        count++; 
    }
}