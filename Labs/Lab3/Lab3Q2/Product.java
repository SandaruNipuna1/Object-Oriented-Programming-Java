package Lab3Q2;

import java.util.Scanner;

public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid price");
        }
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("Quantity should not be negative");
        }
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public double calculateTotalValue() {
        double TotalValue = price * quantity;
        return TotalValue;
    }
}
