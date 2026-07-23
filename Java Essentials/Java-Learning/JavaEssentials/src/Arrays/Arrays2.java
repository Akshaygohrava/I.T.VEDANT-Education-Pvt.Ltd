package Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
        int marks[] = new int[5];    
        
        marks[0] = 56;
        marks[1] = 23;
        marks[2] = 12;
        marks[3] = 31;
        marks[4] = 21;
        // marks[5] = 43;   WIll gives an Errors 
        System.out.println(marks[4]);
        System.out.println(marks[0] + marks[1] + marks[2]);
       
        
        
        char name[] = new char[10];
        
        name[0] = 'A';
        name[1] = 'G';
        name[2] = 'M';
        System.out.println(name[0] + name[1]);
        
        
        
        String names[] = new String[6]; 
        
        names[0] = "Akshay";
        names[1] = "Gohrava";
        names[2] = "Arjun";
        
        System.out.println(names[0] + " " + names[1]);
        
    }
}