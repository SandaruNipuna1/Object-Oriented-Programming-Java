public class IT24101675DMLab1Q1 {
    public static void main(String[] args) {
        //(a).declaring two integer variables and one double variable
        int miles;
        int yards;
        double kilometers;
        //(b).initializing variables
        miles = 26;
        yards = 385;
        //writing an expression and save the result in the variable kilometers
        kilometers = ((yards / 1760.0) + miles)*1.609;
        System.out.println(kilometers);
    }
}
