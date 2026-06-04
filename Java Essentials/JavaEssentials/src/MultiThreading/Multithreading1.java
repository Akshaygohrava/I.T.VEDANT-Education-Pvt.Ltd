package MultiThreading;

public class Multithreading1 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
        Thread t1 = new Thread(() -> {
            while(true) {
                System.out.println("Hello");
            }
        });
        
        t1.setDaemon(true);
        t1.start();
        
        Thread.sleep(10000);
    }
}


// Java Project 1 

// Multithreading  Collection Example , Stop Watch 


// Java Project 2 
// JDBC Basic 