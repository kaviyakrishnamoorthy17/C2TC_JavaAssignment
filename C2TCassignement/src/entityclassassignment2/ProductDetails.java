// File: ProductDetails.java
package entityclassassignment2;

class Product {
    int productId;
    String productName;
    double price;

    // Constructor
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        // Creating 4 product objects
        Product p1 = new Product(1, "Laptop", 55000.00);
        Product p2 = new Product(2, "Smartphone", 25000.50);
        Product p3 = new Product(3, "Headphones", 1500.75);
        Product p4 = new Product(4, "Smartwatch", 4999.99);

        // Display product details
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
    }
}
