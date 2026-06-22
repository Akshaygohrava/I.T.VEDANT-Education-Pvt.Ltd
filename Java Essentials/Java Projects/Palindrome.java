public class Palindrome {
    public static void main(String[] args) {
        System.out.println("This Program is About Palindrome Check !");

        String text = "MOM";
        StringBuilder revserse = new StringBuilder(text).reverse();
        String data = revserse.toString();
        if (data.equals(text)) {
            System.out.println("This Text " + text + " is Palindrome");
        } else {
            System.out.println("This Text " + text + " is Not Palindrome");
        }
      
    }
}