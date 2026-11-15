package Question2;

public class ComboMeal extends Meal{
    protected boolean includesDrinkAndDessert;

    public ComboMeal(){
        super();
        this.includesDrinkAndDessert = false;
    }

    public ComboMeal(String orderID,String customerName,int quantity,boolean includesDrinkAndDessert){
        super(orderID,customerName,quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    @Override
    public double calculateBill(){
        if(includesDrinkAndDessert)
            return (15.00 * quantity) + 5;
        else
            return 15.00 * quantity;
    }

    @Override
    public void displayOrderDetails(){
        System.out.println("--- Combo Meal ---");
        super.displayOrderDetails();
        if(includesDrinkAndDessert)
            System.out.println("Includes Drink & Dessert: " + "Yes");
        else
            System.out.println("Includes Drink & Dessert: " + "No");
        System.out.println("Total Bill: " + calculateBill());
        System.out.println("Bill with $3 coupon: " + calculateBill(3));
    }
}
