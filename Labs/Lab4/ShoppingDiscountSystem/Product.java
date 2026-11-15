package ShoppingDiscountSystem;

import org.w3c.dom.ls.LSOutput;

public class Product {

    //Assigning attributes
    private String productID;
    private String productName;
    private double basePrice;
    private String membershipType;

    //Constructor1
    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    //Constructor2
    public Product(String productID, String productName, double basePrize) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrize;
    }

    //Constructor3
    public Product(String productID, String productName, double basePrize, String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrize;
        this.membershipType = membershipType;
    }

    //Getters and Setters
    public void setMembershipType(String membershipType) {
        if (membershipType.equals("Premium Member") || membershipType.equals("Regular Member") || membershipType.equals("Non-Member")) {
            this.membershipType = membershipType;
        } else {
            this.membershipType = "Non-Member";
        }
    }
    public String getMembershipType(){
        return membershipType;
    }
    public void setBasePrice(double basePrice){
        this.basePrice = basePrice;
    }
    public double getbasePrice(){
        return basePrice;
    }

    public double calculateFinalPrice() {
        if (membershipType.equals("Premium Member")) {
            return basePrice - (basePrice * 0.2);
        } else if (membershipType.equals("Regular Member")) {
            return basePrice - (basePrice * 0.1);
        } else {
            return basePrice;
        }
    }
    public double calculateFinalPrice(double amount){
        if (membershipType.equals("Premium Member")) {
            return basePrice - (basePrice * 0.2) - amount;
        } else if (membershipType.equals("Regular Member")) {
            return basePrice - (basePrice * 0.1) - amount;
        } else {
            return basePrice - amount;
        }
    }

    public void displayProductDetails(){
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Base Price: $" + getbasePrice());
        System.out.println("Membership Type: " + getMembershipType());
        System.out.println("Final Price(after discount): $" + calculateFinalPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product("P1001","Laptop",1000,"Premium Member");
        Product p2 = new Product("P1002","Smartphone",600,"Regular Member");
        Product p3 = new Product("P1003","Headphones",200,"Non-Member");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        System.out.println("Estimated price for smartphone with extra 5$ seasonal discount: $" + p2.calculateFinalPrice(5));
    }
}