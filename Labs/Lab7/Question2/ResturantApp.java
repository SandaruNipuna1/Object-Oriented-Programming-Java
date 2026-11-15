package Question2;

public class ResturantApp {
    public static void main(String[] args) {
        RegularMeal reg = new RegularMeal();
        ComboMeal combo = new ComboMeal("C102","Alice Green",2,true);

        reg.displayOrderDetails();
        combo.displayOrderDetails();
    }
}
