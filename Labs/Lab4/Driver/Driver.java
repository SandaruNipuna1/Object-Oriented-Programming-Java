package Driver;

public class Driver {
    //Including attributes
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    //Constructor1
    Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
    }

    //Constructor2
    Driver(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //Constructor3
    Driver(String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }
    public int getPerformanceScore(){
        return performanceScore;
    }

    public double calculateBonus() {
        double bonusPercentage = 0.0;
        switch (performanceScore) {
            case 5:
                bonusPercentage = 0.25;
                break;
            case 4:
                bonusPercentage = 0.20;
                break;
            case 3:
                bonusPercentage = 0.15;
                break;
            case 2:
                bonusPercentage = 0.10;
                break;
            case 1:
                bonusPercentage = 0.0;
                break;
        }
        return baseSalary*bonusPercentage;
    }

    public double calculateBonus(int customScore) {
        double bonusPercentage = 0.0;
        switch (customScore) {
            case 5:
                bonusPercentage = 0.25;
                break;
            case 4:
                bonusPercentage = 0.20;
                break;
            case 3:
                bonusPercentage = 0.15;
                break;
            case 2:
                bonusPercentage = 0.10;
                break;
            case 1:
                bonusPercentage = 0.0;
                break;
        }
        return baseSalary*bonusPercentage;
    }
    public double calculateTotalSalary(){
        return baseSalary+calculateBonus();
    }
    public void displayDetails(){
        System.out.println("Driver ID: " + getDriverID());
        System.out.println("Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + getPerformanceScore());
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver("D1001","John Smith",4000.0,5);
        Driver driver2 = new Driver("D1002","Emily Davis",3500.0,3);
        Driver driver3 = new Driver("D1003","Michael Johnson",5000.0,1);

        driver1.displayDetails();
        System.out.println();
        driver2.displayDetails();
        System.out.println();
        driver3.displayDetails();
        System.out.println();
        System.out.println("Bonus for driver3 with custom rating 4: "+ driver3.calculateBonus(4));
    }
}
