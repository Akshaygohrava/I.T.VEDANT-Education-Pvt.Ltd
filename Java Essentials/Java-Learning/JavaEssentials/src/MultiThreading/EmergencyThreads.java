package MultiThreading;
import java.util.LinkedList;
import java.util.Scanner;

public class EmergencyThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
       LinkedList<String> patients = new LinkedList<String>();
       
       Thread t1 = new Thread(() -> {
    	   for(int i = 1; i <= 5; i++) {
        	   System.out.println("Enter Patient Name : ");
        	   String PatientName = sc.next();
        	   
        	   System.out.println("Is it emergency @");
        	   char isEmergency = sc.next().charAt(0);
        	   
        	   if(isEmergency=='y') {
        		   patients.addFirst(PatientName);
        	   }
        	   else {
        		   patients.add(PatientName);
        	   }
           }
       });
       
       t1.start();
      // System.out.println(patients);
       
       Thread thread = new Thread(() -> {
    	   while(true) {
    		   try {
    			   Thread.sleep(1000);
    		   }
    		   catch(InterruptedException e) {
    			   e.printStackTrace();
    			   System.out.println("Patient Treated " + patients.pollFirst());
    		   }
    	   }
       });
       
       thread.start();
	}
}