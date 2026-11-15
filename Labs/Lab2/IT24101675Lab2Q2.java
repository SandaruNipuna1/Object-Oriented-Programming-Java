import java.util.Scanner;

public class IT24101675Lab2Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //accept 5 integer values from the user and store them in an array
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            arr[i] = scn.nextInt();
        }

        //finding the largest value
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //finding the sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        //print the largest value
        System.out.println("The largest value is: " + max);

        //print the sum of elements
        System.out.print("The sum of all values is: " + sum);
    }
}
