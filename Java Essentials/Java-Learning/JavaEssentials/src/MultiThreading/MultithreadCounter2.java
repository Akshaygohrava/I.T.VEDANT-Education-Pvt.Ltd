package MultiThreading;

public class MultithreadCounter2 {

    public static void main(String[] args) throws InterruptedException  {
        
        MultithreadCounter counter = new MultithreadCounter();
        
        // Creating Thread 
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {  // Fixed: Changed i+= to i++
                counter.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {  // Fixed: Changed i+= to i++
                counter.increment();
            }
        });
        
        t1.start();
        t2.start();

        t1.join();  // Added: Handles InterruptedException
        t2.join();  // Added: Handles InterruptedException
        
        System.out.println(counter.count);
    }
}