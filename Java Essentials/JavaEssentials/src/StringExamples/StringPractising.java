package StringExamples;

public class StringPractising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Practise On This String, Array, Text, Just n Paste 
		String name = "Akshay";
		
		String words = "Java is Fun";
		
		String[] fruit = {"Banana" , "Apple", "Beet","Oranges", "Avacado", "Mango","Chiku"};
		
		int[] marks = {35, 44, 32, 56, 41, 33, 55, 39};
		
		
		// Program To Find , Fruit Name Start with Letter A
		String[] fruits = {"Banana" , "Apple", "Beet","Oranges", "Avacado", "Mango","Chiku"};
		
		String startA = fruits[0];
		
		for(String a : fruits) {
			if(a.startsWith("A")) {
				startA = a;
			}
			
		}
		System.out.println(startA);
		
		
		// Find Highest Marks From Array Marks
		int[] mark = {35, 44, 32, 56, 41, 33, 55, 39};
		
		int HighMark = mark[0];
		
		for(int high : mark) {
			if(high > HighMark) {
				HighMark = high;
			}
		}
		System.out.println(HighMark);
		
		
		
		
		
		System.out.println(name.isEmpty());
		
		// String Buffer and Builder Praxtises ....
		StringBuilder Name = new StringBuilder();
		
		Name.append("Akshay Gohrava");
		Name.insert(14, " Is 24 Year Old !");
		Name.delete(0, 15);
		Name.insert(0, "Akshay ");
		
		System.out.println(Name);
		
		
		
		StringBuffer Names = new StringBuffer();
		
		Names.append("Hello, String Buffer");
		
		System.out.println(Names);
		
		
		// Reverse a Number 
		
		int num = 12345;
		
		StringBuilder rev = new StringBuilder(Integer.toString(num));
		
		rev.reverse();
		
		int revint = Integer.parseInt(rev.toString());
		
		System.out.println(revint);
		
		
		
		
	
	}

}
