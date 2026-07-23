package Queues;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
       LinkedList<String> patients = new LinkedList<String>();
       
       for(int i =1; i <=5;i++) {
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
       
       
       System.out.println(patients);
       
       
	}

}
