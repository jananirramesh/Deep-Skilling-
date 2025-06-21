package Ecommerce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Product class
class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("- " + name + " (" + category + ") - $" + price);
    }
}

// Main class
public class EcommercePlatform {
    private static final List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        initializeProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-commerce Platform Search!");

        while (true) {
            System.out.print("\nSearch by (1) Name, (2) Category, (3) Exit: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter product name to search: ");
                    String nameQuery = scanner.nextLine().toLowerCase();
                    searchByName(nameQuery);
                }
                case 2 -> {
                    System.out.print("Enter product category to search: ");
                    String categoryQuery = scanner.nextLine().toLowerCase();
                    searchByCategory(categoryQuery);
                }
                case 3 -> {
                    System.out.println("Thank you for using the platform. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Initialize some mock products
    private static void initializeProducts() {
        products.add(new Product("iPhone 14", "Electronics", 999.99));
        products.add(new Product("Samsung Galaxy S23", "Electronics", 899.99));
        products.add(new Product("Nike Running Shoes", "Footwear", 120.00));
        products.add(new Product("Levi's Jeans", "Clothing", 59.99));
        products.add(new Product("Sony Headphones", "Electronics", 149.99));
        products.add(new Product("Adidas Sneakers", "Footwear", 89.50));
    }

    // Search by product name
    private static void searchByName(String nameQuery) {
        System.out.println("Search Results for name: " + nameQuery);
        boolean found = false;
        for (Product product : products) {
            if (product.getName().contains(nameQuery)) {
                product.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found.");
        }
    }

    // Search by product category
    private static void searchByCategory(String categoryQuery) {
        System.out.println("Search Results for category: " + categoryQuery);
        boolean found = false;
        for (Product product : products) {
            if (product.getCategory().equals(categoryQuery)) {
                product.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found.");
        }
    }
}

