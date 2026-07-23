package MultiThreading;

public class ThreadTesting extends Thread {
	
	void number() {
		for(int i =1;i < 6;i++) {
			System.out.println("Count : "+ i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTesting t1 = new ThreadTesting();
		ThreadTesting t2 = new ThreadTesting();
         
         t1.start();
         t2.start();
         
	}

}
