package inventorymanagement;
import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class inventory {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        if (products.containsKey(product.productId)) {
            System.out.println("Product ID already exists.");
        } else {
            products.put(product.productId, product);
            System.out.println("Product added successfully.");
        }
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product ID not found.");
        }
    }


    public void deleteProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        inventory inv = new inventory();
        
        // Adding products
        inv.addProduct(new Product(101, "Mouse", 50, 299.99));
        inv.addProduct(new Product(102, "Keyboard", 30, 499.99));
        inv.addProduct(new Product(103, "Monitor", 20, 6999.99));

        // Display inventory
        System.out.println("\nCurrent Inventory:");
        inv.displayInventory();

        // Update a product
        inv.updateProduct(102, "Mechanical Keyboard", 40, 899.99);

        // Delete a product
        inv.deleteProduct(103);

        // Final Inventory
        System.out.println("\nUpdated Inventory:");
        inv.displayInventory();
    }
}

