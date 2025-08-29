import java.util.*;

class Product {
    int pid;
    String pname;
    double price;

    // 🔹 Method to accept product details
    void acceptDetails(Scanner sc) {
        System.out.print("Enter Product ID: ");
        this.pid = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Product Name: ");
        this.pname = sc.nextLine();

        System.out.print("Enter Product Price: ");
        this.price = sc.nextDouble();
    }

    // 🔹 Method to display product details
    void displayDetails() {
        System.out.println("PID: " + this.pid + ", Name: " + this.pname + ", Price: ₹" + this.price);
    }

    // 🔹 Method to return price (for total calculation)
    double getPrice() {
        return this.price;
    }
}
class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5]; // Array of 5 Product objects

        System.out.println("Enter details of 5 products:");

        for (int i = 0; i < products.length; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");
            products[i] = new Product(); // Create object
            products[i].acceptDetails(sc); // Accept details
        }

        System.out.println("\n--- Product Details ---");
        double totalAmount = 0;

        for (Product p : products) {
            p.displayDetails();
            totalAmount += p.getPrice(); // Add price to total
        }

        System.out.println("\n Total Amount of All Products: ₹" + totalAmount);
    }
}
