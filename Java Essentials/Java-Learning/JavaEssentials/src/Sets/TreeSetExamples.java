package Sets;

import java.util.TreeSet;
import java.util.Comparator;

class Product {
    int id;
    String name;
    double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

public class TreeSetExamples {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 45000);
        Product p2 = new Product(102, "Headphone", 14000);
        Product p3 = new Product(103, "MobilePhone", 17000);
        
        // Custom comparator to sort by price
        TreeSet<Product> products = new TreeSet<Product>(
            Comparator.comparingDouble(p -> p.price)
        );
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        
        System.out.println(products);
    }
}