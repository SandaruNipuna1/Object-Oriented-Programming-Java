import java.util.Scanner;

public class IT24101675Lab2Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // prompt the user to enter an integer number of seconds
        System.out.println("Enter the number of seconds: ");
        int seconds = scn.nextInt();

        //convert the seconds into hours, minutes, and remaining seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;

        //display converted hours, minutes, and remaining seconds
        System.out.println("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + second);
    }
}
