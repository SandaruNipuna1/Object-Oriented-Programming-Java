package Question3;

import java.util.Scanner;


public class demo {

    public class EvenOddNumber {
        public static boolean findEvenOrOdd(int i) {
            return i % 2 == 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (EvenOddNumber.findEvenOrOdd(number)){
            System.out.println("The number " + number + " is even.");
        }
        else {
            System.out.println("The number " + number + " is not even.");
        }

    }

}
