import java.util.Scanner;

public class IT24101675Lab2Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //accepting user inputs
        System.out.print("Enter employee type: ");
        int type = scn.nextInt();
        System.out.print("Enter basic salary: ");
        int basic = scn.nextInt();
        System.out.print("Enter overtime hours: ");
        int othours = scn.nextInt();

        //assignning the respective overtime rate(OtRate)
        int OtRate = 0;
        if (type == 1) {
            OtRate = 1000;
        } else if (type == 2) {
            OtRate = 1500;
        } else if (type == 3) {
            OtRate = 1700;
        }

        //calculating the total salary using the formula
        int total;
        total = basic+(othours * OtRate);

        //display the employee's total salary
        System.out.println("Employee's total salary is: " + total);
    }
}
