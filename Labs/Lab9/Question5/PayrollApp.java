package Question5;

abstract class Employee {
    private String empId;
    private String EmpName;

    public String getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return EmpName;
    }

    public Employee(String empId,String empName){
        this.empId = empId;
        this.EmpName = empName;
    }

    public abstract double calculateSalary();
}

interface Payable{
    void generatePayslip();
}

class PermanentEmployee extends Employee implements Payable{
    private double monthlySalary;

    public PermanentEmployee(String empId,String empName,double monthlySalary){
        super(empId,empName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

    @Override
    public void generatePayslip(){
        System.out.println("Permanent Employee Payslip");
        System.out.println("Emp ID: " + getEmpId());
        System.out.println("Name: " + getEmpName());
        System.out.println("Salary: $" + calculateSalary());
    }
}

class ContractEmployee extends Employee implements Payable{
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String empId,String empName,int hoursWorked, double hourlyRate){
        super(empId,empName);
        this.hoursWorked =hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public void generatePayslip(){
        System.out.println("Contract Employee Payslip");
        System.out.println("Emp ID: " + getEmpId());
        System.out.println("Name: " + getEmpName());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class PayrollApp{
    public static void main(String[] args) {

        PermanentEmployee pe = new PermanentEmployee("A101","Sandaru",5000.00);
        ContractEmployee ce = new ContractEmployee("A102","Bob",150,300.00);

        System.out.println("=== Payslips ===");
        pe.generatePayslip();
        System.out.println();
        ce.generatePayslip();

    }
}
