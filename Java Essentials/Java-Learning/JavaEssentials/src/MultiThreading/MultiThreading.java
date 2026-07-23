package MultiThreading;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Java MultiThreading !");
        
        // Create and start threads
        Thread thread1 = new PrintNumbers();
        Thread thread2 = new Thread(new PrintLetters());
        
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish
        thread1.join();
        thread2.join();
        
        System.out.println("Both threads finished!");
    }
}

class PrintNumbers extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintLetters implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}