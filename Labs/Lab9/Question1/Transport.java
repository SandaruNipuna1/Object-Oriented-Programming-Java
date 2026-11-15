package Question1;

abstract class Transport {
    protected int vehicleNum;
    protected int distanceTravelled;

    public Transport(){
        this.vehicleNum = 0;
        this.distanceTravelled = 0;
    }

    public Transport(int vehicleNum, int distanceTravelled) {
        this.vehicleNum = vehicleNum;
        this.distanceTravelled = distanceTravelled;
    }

    public abstract double calculateFare();

    public void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleNum);
        System.out.println("Distance Travelled: " + distanceTravelled + "k/m");
    }
}

class Bus extends Transport{

    public Bus(int vehicleNum, int distanceTravelled) {
        super(vehicleNum, distanceTravelled);
    }

    @Override
    public double calculateFare(){
        return 10 * distanceTravelled;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bus Fare: $" + calculateFare());
    }
}

class Taxi extends Transport{

    public Taxi(int vehicleNum, int distanceTravelled){
        super(vehicleNum, distanceTravelled);
    }

    @Override
    public double calculateFare(){
        return 20 * distanceTravelled + 50;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Taxi Fare: $" + calculateFare());
    }
}

class transportApp{
    public static void main(String[] args) {
        Bus bus = new Bus(1234,10);
        Taxi taxi = new Taxi(5678,10);

        bus.displayDetails();
        System.out.println();
        taxi.displayDetails();

    }
}
