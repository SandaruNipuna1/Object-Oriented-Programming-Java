package Question5;

public class Calculator {
    public static int add(int x, int y){
        return x + y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int square(int x, int y){
        int returnVal = 1;
        for (int i = y; y > 0; y--){
            returnVal = returnVal * x;
        }
        return returnVal;
    }

    public static void main(String[] args) {
        System.out.print("Question 1: ");
        int ans = Calculator.square(Calculator.add(Calculator.multiply(3,4), Calculator.multiply(5,7)),2);
        System.out.println(ans);

        System.out.print("Question 2: ");
        ans = Calculator.add(Calculator.square((Calculator.add(4,7)), 2), Calculator.square(Calculator.add(8,3),2));
        System.out.println(ans);
    }

}
