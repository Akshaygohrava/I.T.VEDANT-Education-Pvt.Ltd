package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// Product class to represent the product data
class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

public class StreamAPI2 {
    public static void main(String[] args) {
        
        // Create the list of products with 3 products only
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "laptop", 35000));
        products.add(new Product(102, "mouse", 500));
        products.add(new Product(103, "keyboard", 1200));
        
        // Display all products
        products.stream()
                .forEach((p) -> System.out.println(p));
        
        System.out.println("============== List All ,Only Products Names");
        
        // Get list of product names
        List<String> productNames = products.stream()
                .map((p) -> p.getName())
                .toList();
        
        System.out.println(productNames);
        
        System.out.println("================ Add price 2000, in exiting products  ");
        
        // CORRECTED: Changed 'Products' to 'Product'
        products = products.stream()
                .map(p -> new Product(p.getId(), p.getName(), p.getPrice() + 2000))
                .toList();        
        
        System.out.println(products);
        
        
        System.out.println("============= Get Products Price Less than 3000");
        
        // To Get New List , Of products , which price is less than 2000
        
        List<Product> list =  products.stream()
        .filter(p -> p.getPrice() < 3000)
        .toList();        
        
        System.out.println(list);
        
        
        System.out.println("=================== To Get Names of Products , Starts with M");
        
        products.stream()
        .filter(p -> p.getName().startsWith("m"))
        .forEach(p -> System.out.println(p));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Explain The Code In Simple Words, Explain each concepts.. in Deepseeks
    }
}