package Lab3Q2;

import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product ID: ");
        product.setProductID(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Enter product name: ");
        product.setProductName(scanner.nextLine());

        System.out.println("Enter product price: ");
        product.setPrice(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter product quantity: ");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();

        product.displayDetails();

        System.out.println("\nTotal value is: " + product.calculateTotalValue());

    }
}
