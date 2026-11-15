package Lab3Q3;
import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String employeeName;
    private int empPerformance;
    private double empbasicSalary;

    public int getEmployeeId() {
        return employeeID;
    }

    public void setEmployeeId(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public int getEmpPerformance() {
        return empPerformance;
    }
    public void setEmpPerformance(int empPerformance) {
        if (empPerformance < 1 && empPerformance > 5) {
            System.out.println("Invalid emp performance");
        }
        this.empPerformance = empPerformance;
    }
    public double getEmpbasicSalary() {
        return empbasicSalary;
    }
    public void setEmpbasicSalary(double empbasicSalary) {
        this.empbasicSalary = empbasicSalary;
    }
    public double calculateBonus(){
        double bonusPercentage = 0;
        switch (empPerformance) {
            case 5: bonusPercentage = 0.20;
            break;
            case 4: bonusPercentage = 0.15;
            break;
            case 3: bonusPercentage = 0.10;
            break;
            case 2: bonusPercentage = 0.05;
            break;
            case 1: bonusPercentage = 0.00;
            break;
        }
        return empbasicSalary * bonusPercentage;
    }
    public double calculateTotalSalary(){
        return empbasicSalary + calculateBonus();
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        employee.setEmployeeName(scanner.nextLine());
        System.out.print("Enter Basic Salary: ");
        employee.setEmpbasicSalary(scanner.nextDouble());
        System.out.print("Enter Performance Rating (1-5): ");
        employee.setEmpPerformance(scanner.nextInt());

        System.out.println("\nEmployee Details: ");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Basic Salary: " + employee.getEmpbasicSalary());
        System.out.println("Performance Rating: " + employee.getEmpPerformance());
        System.out.println("Bonus: " + employee.calculateBonus());
        System.out.println("Total Salary: " + employee.calculateTotalSalary());
    scanner.close();
    }
}
