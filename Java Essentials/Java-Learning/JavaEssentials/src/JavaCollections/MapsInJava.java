package JavaCollections;

import java.util.*;
import java.util.stream.Collectors;

public class MapsInJava {

    public static void main(String[] args) {
        
        // ============================================================
        // 1. HASHMAP - Most commonly used, unsorted, O(1) average
        // ============================================================
        System.out.println("========== HASHMAP ==========");
        System.out.println("Use: Fast lookups, no ordering needed, allows null");
        System.out.println("Order: No guaranteed order");
        System.out.println("Null: Allows 1 null key, multiple null values");
        System.out.println("Thread-safe: No\n");
        
        Map<String, Integer> hashMap = new HashMap<>();  // Use Map, not MapsInJava
        
        // ADD
        hashMap.put("Alice", 95);
        hashMap.put("Bob", 87);
        hashMap.put("Charlie", 92);
        hashMap.put(null, 100);        // Null key allowed
        hashMap.put("David", null);    // Null value allowed
        hashMap.putIfAbsent("Alice", 99); // Only if key absent
        
        System.out.println("After ADD: " + hashMap);
        
        // GET
        System.out.println("Get 'Alice': " + hashMap.get("Alice"));
        System.out.println("Get 'Unknown': " + hashMap.getOrDefault("Unknown", 0));
        System.out.println("Get null key: " + hashMap.get(null));
        
        // CHECK
        System.out.println("Contains 'Bob'? " + hashMap.containsKey("Bob"));
        System.out.println("Contains value 100? " + hashMap.containsValue(100));
        System.out.println("Size: " + hashMap.size());
        System.out.println("Is empty? " + hashMap.isEmpty());
        
        // REPLACE
        hashMap.replace("Charlie", 98);              // Replace value
        hashMap.replace("David", null, 55);          // Replace if value matches
        hashMap.compute("Alice", (k, v) -> v + 5);   // Compute new value
        hashMap.computeIfPresent("Bob", (k, v) -> v * 2);
        hashMap.computeIfAbsent("Eve", k -> 88);     // Add if absent
        
        System.out.println("After REPLACE/COMPUTE: " + hashMap);
        
        // REMOVE
        hashMap.remove("Alice");                     // Remove by key
        hashMap.remove("Bob", 174);                  // Remove if key-value matches
        System.out.println("After REMOVE: " + hashMap);
        
        // VIEWS
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries: " + hashMap.entrySet());
        
        // ITERATE
        System.out.print("Iterating: ");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {  // Use Map.Entry
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();
        
        // BULK
        Map<String, Integer> extra = new HashMap<>();  // Use Map, not MapsInJava
        extra.put("Frank", 77);
        extra.put("Grace", 88);
        hashMap.putAll(extra);
        System.out.println("After putAll: " + hashMap);
        
        hashMap.clear();
        System.out.println("After clear: " + hashMap + "\n");
        System.out.println("Key Use Cases: Caching, configuration, any key-value mapping\n");
        
        // ============================================================
        // 2. LINKEDHASHMAP - Maintains insertion/access order
        // ============================================================
        System.out.println("========== LINKEDHASHMAP ==========");
        System.out.println("Use: When order matters, LRU cache");
        System.out.println("Order: Insertion order (or access order)");
        System.out.println("Null: Allows null keys/values");
        System.out.println("Thread-safe: No\n");
        
        // Insertion order (default)
        Map<String, Integer> linkedMap = new LinkedHashMap<>();  // Use Map interface
        linkedMap.put("First", 1);
        linkedMap.put("Second", 2);
        linkedMap.put("Third", 3);
        System.out.println("Insertion order: " + linkedMap);
        
        // Access order (LRU cache example)
        Map<String, Integer> lruCache = new LinkedHashMap<String, Integer>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3;  // Cache size limit
            }
        };
        
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);
        System.out.println("LRU Cache (size 3): " + lruCache);
        
        lruCache.get("A");  // Access A - moves to end
        lruCache.get("B");  // Access B - moves to end
        lruCache.put("D", 4); // Will remove least recently used (C)
        System.out.println("After accessing A, B and adding D: " + lruCache);
        System.out.println("LRU removed: " + (lruCache.containsKey("C") ? "No" : "C was removed"));
        
        // Same methods as HashMap
        linkedMap.remove("Second");
        System.out.println("After remove: " + linkedMap);
        linkedMap.put("Fourth", 4);
        System.out.println("After add: " + linkedMap);
        System.out.println("Key Use Cases: LRU cache, preserving order, FIFO queues\n");
        
        // ============================================================
        // 3. TREEMAP - Sorted by keys (natural or custom order)
        // ============================================================
        System.out.println("========== TREEMAP ==========");
        System.out.println("Use: When sorting needed, range queries");
        System.out.println("Order: Sorted by key (natural or comparator)");
        System.out.println("Null: No null keys, null values allowed");
        System.out.println("Thread-safe: No\n");
        
        // Natural order (ascending)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Apple", 50);
        treeMap.put("Monkey", 75);
        treeMap.put("Cat", 30);
        treeMap.put("Dog", 40);
        System.out.println("Natural order: " + treeMap);
        
        // Custom comparator (reverse order)
        TreeMap<String, Integer> treeMapReverse = new TreeMap<>(Comparator.reverseOrder());
        treeMapReverse.putAll(treeMap);
        System.out.println("Reverse order: " + treeMapReverse);
        
        // TREE MAP SPECIFIC METHODS
        System.out.println("\n--- TreeMap Specific Methods ---");
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());
        
        System.out.println("\n--- Navigation Methods ---");
        System.out.println("Lower than 'Monkey': " + treeMap.lowerKey("Monkey"));
        System.out.println("Floor than 'Monkey': " + treeMap.floorKey("Monkey"));
        System.out.println("Ceiling than 'Monkey': " + treeMap.ceilingKey("Monkey"));
        System.out.println("Higher than 'Monkey': " + treeMap.higherKey("Monkey"));
        
        System.out.println("\n--- Range View Methods ---");
        System.out.println("Head (< 'Monkey'): " + treeMap.headMap("Monkey"));
        System.out.println("Tail (>= 'Monkey'): " + treeMap.tailMap("Monkey"));
        System.out.println("Sub (Apple to Zebra): " + treeMap.subMap("Apple", "Zebra"));
        System.out.println("Sub inclusive: " + treeMap.subMap("Apple", true, "Zebra", false));
        
        System.out.println("\n--- Poll/Remove ---");
        System.out.println("Poll first: " + treeMap.pollFirstEntry());
        System.out.println("Poll last: " + treeMap.pollLastEntry());
        System.out.println("After poll: " + treeMap);
        
        // Descending views
        System.out.println("\n--- Descending Views ---");
        System.out.println("Descending keys: " + treeMap.descendingKeySet());
        System.out.println("Descending map: " + treeMap.descendingMap());
        
        System.out.println("\nKey Use Cases: Sorted data, range queries, auto-sorted keys");
        
        // ============================================================
        // COMPARISON TABLE
        // ============================================================
        System.out.println("\n========== QUICK COMPARISON ==========");
        System.out.println("┌──────────────┬──────────────┬────────────┬────────────┬───────────┐");
        System.out.println("│ Feature      │ HashMap      │ LinkedHashMap│ TreeMap   │");
        System.out.println("├──────────────┼──────────────┼────────────┼────────────┼───────────┤");
        System.out.println("│ Order        │ None         │ Insertion  │ Sorted     │");
        System.out.println("│ Null keys    │ Yes (1)      │ Yes        │ No         │");
        System.out.println("│ Null values  │ Yes          │ Yes        │ Yes        │");
        System.out.println("│ Performance  │ O(1)         │ O(1)       │ O(log n)   │");
        System.out.println("│ Thread-safe  │ No           │ No         │ No         │");
        System.out.println("│ Use case     │ General      │ Order/LRU  │ Sorting    │");
        System.out.println("└──────────────┴──────────────┴────────────┴────────────┴───────────┘\n");
        
        // ============================================================
        // PRACTICAL CHOICE GUIDE
        // ============================================================
        System.out.println("========== WHEN TO USE WHAT? ==========");
        System.out.println("📌 HashMap     : Default choice, fastest, no ordering needed");
        System.out.println("📌 LinkedHashMap: When you need insertion order or LRU cache");
        System.out.println("📌 TreeMap     : When you need sorted keys or range queries");
        System.out.println();
        System.out.println("All three use .equals() and .hashCode() for keys (except TreeMap uses Comparable)");
    }
}