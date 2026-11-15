import java.util.Scanner;
//creating class Demo
public class Demo {
    public static void main(String[] args) {
        //creating a object from EvenOddNumber
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        //calling the findEvenorOdd() method and display outputs
        if (EvenOddNumber.findEvenOrOdd(number)){
            System.out.println("The number " + number + " is even number.");
        }
        else {
            System.out.println("The number " + number + " is Odd number.");
        }

    }

}