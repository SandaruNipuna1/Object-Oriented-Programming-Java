package Question2;

public class RegularMeal extends Meal{
    protected boolean isVegetarian;

    public RegularMeal(){
        super();
        this.isVegetarian = false;
    }

    public RegularMeal(String orderID,String customerName,int quantity,boolean isVegetarian){
        super(orderID,customerName,quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill(){
        return 10 * quantity;
    }

    @Override
    public void displayOrderDetails(){
        System.out.println("--- Regular Meal ---");
        super.displayOrderDetails();
        if(isVegetarian){
            System.out.println("Meal Type: " + "Non-Vegetarian");
        }else {
            System.out.println("Meal Type: " + "Vegetarian");
        }
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Bill with $2 coupon: $" + calculateBill(2));
        System.out.println();
    }
}
