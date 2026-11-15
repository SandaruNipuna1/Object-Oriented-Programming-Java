public class Calculator {
    //implementing three java methods to perform operations
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        //calculating the result of 1st mathematical expression
        int result1 = calc.multiply(3,4);
        int result2 = calc.multiply(5,7);
        int result3 = calc.add(result1,result2);
        int finalresult1 = calc.square(result3);

        //calculating the result of 2nd mathematical expression
        int sum1 = calc.add(4,7);
        int sum2 = calc.add(8,3);
        int squaresum1 = calc.square(sum1);
        int squaresum2 = calc.square(sum2);
        int finalresult2 = calc.add(squaresum1,squaresum2);

        //print the results
        System.out.println(finalresult1);
        System.out.println(finalresult2);
    }
}

