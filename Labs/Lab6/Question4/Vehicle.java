package Question4;

public class Vehicle {
    private String vehicleName;

    //default constructor
    public Vehicle(){
        this.vehicleName = "N/A";
    }

    //parameterized constructor
    public Vehicle(String vehicleName){
        this.vehicleName = vehicleName;
    }

    //vehicle details method
    public void displayVehicleDetails(){
        System.out.println("Vehicle Name: " + this.vehicleName);
    }

    //calculateSpeed method(no parameters)
    public double calculateSpeed(){
        return 0.00;
    }

    //calculateSpeed overloaded method(with parameter)
    public double calculateSpeed(double factor){
        double defSpeed = calculateSpeed();
        return defSpeed * factor;
    }
}
class Car extends Vehicle{
    private int engineCapacity;
    private double topSpeed;

    //default constructor
    public Car(){
        super();
        this.engineCapacity = 0;
        this.topSpeed = 0.00;
    }

    //parameterized constructor
    public Car(String vehicleName,int engineCapacity,double topSpeed){
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    //override calculateSpeed method
    @Override
    public double calculateSpeed(){
        return topSpeed;
    }

    //override displayVehicleDetails method
    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("Top Speed: " + topSpeed + "km/h");
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}
class Bicycle extends Vehicle{
    private int gearCount;
    private double maxPedalSpeed;

    //default constructor
    public Bicycle(){
        super();
        this.gearCount = 0;
        this.maxPedalSpeed = 0.00;
    }

    //parameterized constructor
    public Bicycle(String vehicleName,int gearCount,double maxPedalSpeed){
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    //override the calculateSpeed method
    @Override
    public double calculateSpeed(){
        return maxPedalSpeed;
    }

    //override displayVehicleDetails method
    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("Max Pedal Speed: " + maxPedalSpeed + "km/h");
        System.out.println("Gear Count: " + gearCount);
    }

    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle("Ducati",6,40);

        System.out.println("Car Speed (Default Speed): " + c.calculateSpeed());
        System.out.println("Car Speed (After applying factor 1.5): " + c.calculateSpeed(1.5));

        System.out.println("Bicycle Speed (Default Speed): " + b.calculateSpeed());
        System.out.println("Bicycle Speed (After applying factor 1.2): " + b.calculateSpeed(1.2));

        System.out.println("\n===Car Details===");
        c.displayVehicleDetails();

        System.out.println("\n===Bicycle Details===");
        b.displayVehicleDetails();
    }
}