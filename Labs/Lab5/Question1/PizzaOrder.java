package Question1;

import java.util.Scanner;

public class PizzaOrder {
    //Attributes
    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    //default constructor
    public PizzaOrder() {
        this.orderID = "N/A";
        this.customerName = "N/A";
        this.size = "Small";
        this.toppingCount = 0;
        this.isDelivery = false;
    }

    //overloaded constructor1
    public PizzaOrder(String driverID, String customerName) {
        this.orderID = driverID;
        this.customerName = customerName;
    }

    public PizzaOrder(String driverID, String customerName, String size, int toppingCount, boolean isDelivery) {
        this.orderID = driverID;
        this.customerName = customerName;
        this.size = size;
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    public void setSize(String size) {
        if (size == "Small" || size == "Medium" || size == "Large")
            this.size = size;
        else {
            this.size = "Small";
        }
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        if (size == "Small")
            return 8;
        else if (size == "Medium")
            return 10;
        else if (size == "Large")
            return 12;
        return -1;
    }
    public double calculateTotalPrice(){
        double deliveryCharge = 2;
        double totalPrice = getBasePrice() + (toppingCount * 1.5);
        if(isDelivery){
            totalPrice += deliveryCharge;
        }
        return totalPrice;
    }
    public double calculateTotalPrice(double discountPercentage){
        double totalPrice = calculateTotalPrice();
        totalPrice -= totalPrice*(discountPercentage/100);
        return totalPrice;
    }
    public int estimatePreparationTime(){
        int estimatedTime = 0;
        estimatedTime *= toppingCount;
        return estimatedTime;
    }
    public void displayOrderDetails(){
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Size: " + getSize());
        System.out.println("Topping Count: " + toppingCount);
        System.out.println("Delivery Charges Added(True/False): " + isDelivery);
        System.out.println("Total Price: $" + calculateTotalPrice());
        System.out.println("Estimated preparation time: " + estimatePreparationTime());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //First order
        PizzaOrder order1 = new PizzaOrder("03001","Olivia Green","Medium",3,true);
        order1.displayOrderDetails();

        //Second order
        PizzaOrder order2 = new PizzaOrder("03002","Noah Smith1","Large",2,false);
        order2.displayOrderDetails();
        System.out.print("Enter the discount percentage: ");
        double Percentage = sc.nextDouble();
        System.out.println("Order 02 - Price after the discount: $" + order2.calculateTotalPrice(Percentage));
        System.out.println();

        //Third order using default constructor
        PizzaOrder order3 = new PizzaOrder();
        order3.displayOrderDetails();
    }
}
