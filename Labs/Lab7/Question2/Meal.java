package Question2;

public class Meal {
    protected String orderID;
    protected String customerName;
    protected int quantity;

    //default constructor
    public Meal(){
        this.orderID = "000";
        this.customerName = "Guest";
        this.quantity = 0;
    }

    //parameterized constructor
    public Meal(String orderID,String customerName,int quantity){
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: " + this.orderID);
        System.out.println("Customer Name: "+ this.customerName);
        System.out.println("Quantity: " + this.quantity);
    }

    public double calculateBill(){
        return 12.00 * quantity;
    }

    public double calculateBill(int couponAmount){
        double base = calculateBill();
        if(base == 0)
            return base;
        else
            return base - (couponAmount*quantity);
    }
}
