package StringExamples;

public class StringBuilderBuffer {

public static void main(String[] args) {
        
        // ========== 1. CREATE ==========
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");
        
        // ========== 2. APPEND (add to end) ==========
        sb.append(" World");        // "Hello World"
        sb.append(123);             // "Hello World123"
        sb.append(true);            // "Hello World123true"
        System.out.println(sb);     // Hello World123true
        
        // ========== 3. INSERT (add at position) ==========
        sb = new StringBuilder("HelloWorld");
        sb.insert(5, " ");          // "Hello World"
        sb.insert(0, "Start ");     // "Start Hello World"
        System.out.println(sb);     // Start Hello World
        
        // ========== 4. DELETE (remove characters) ==========
        sb.delete(6, 11);           // Remove "Hello" -> "Start  World"
        sb.deleteCharAt(5);         // Remove space -> "StartWorld"
        System.out.println(sb);     // StartWorld
        
        // ========== 5. REPLACE (change portion) ==========
        sb = new StringBuilder("Hello Java");
        sb.replace(6, 10, "Python"); // "Hello Python"
        System.out.println(sb);      // Hello Python
        
        // ========== 6. REVERSE (flip string) ==========
        sb = new StringBuilder("Java");
        sb.reverse();                // "avaJ"
        System.out.println(sb);      // avaJ
        
        // ========== 7. GET & SET CHARACTER ==========
        sb = new StringBuilder("Hello");
        char ch = sb.charAt(0);      // 'H'
        sb.setCharAt(0, 'J');        // "Jello"
        System.out.println(sb);      // Jello
        
        // ========== 8. EXTRACT SUBSTRING ==========
        sb = new StringBuilder("Programming");
        String sub = sb.substring(0, 4);   // "Progr" wait, (0,4) gives "Prog"
        System.out.println(sub);            // Prog (0,1,2,3)
        
        // ========== 9. SEARCH ==========
        sb = new StringBuilder("Hello Hello");
        int first = sb.indexOf("Hello");     // 0
        int last = sb.lastIndexOf("Hello");  // 6
        System.out.println(first + ", " + last); // 0, 6
        
        // ========== 10. LENGTH & CAPACITY ==========
        sb = new StringBuilder("Java");
        System.out.println("Length: " + sb.length());     // 4
        System.out.println("Capacity: " + sb.capacity()); // 20 (16+4)
        
        sb.setLength(2);           // Truncate to "Ja"
        System.out.println(sb);    // Ja
        
        // ========== 11. CLEAR STRING ==========
        sb.setLength(0);           // Best way to clear
        // OR
        sb.delete(0, sb.length());
        
        // ========== 12. CONVERT TO STRING ==========
        String result = sb.toString();
        
        // ========== PRACTICAL EXAMPLES ==========
        
        // Example 1: Loop concatenation (FAST)
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            sb2.append(i).append(", ");
        }
        System.out.println(sb2);   // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
        
        // Example 2: Build SQL query
        StringBuilder query = new StringBuilder("SELECT * FROM users");
        query.append(" WHERE age > ").append(18);
        query.append(" ORDER BY name");
        System.out.println(query); // SELECT * FROM users WHERE age > 18 ORDER BY name
        
        // Example 3: Remove vowels
        sb = new StringBuilder("Hello World");
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);    // Hll Wrld
    }

}
