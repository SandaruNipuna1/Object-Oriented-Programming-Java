package Question1;

public class Room {
    protected String roomNumber;
    protected String guestName;
    protected int numOfNights;

    public Room(){
        this.roomNumber = "000";
        this.guestName = "Unknown";
        this.numOfNights = 0;
    }

    public Room(String roomNumber,String guestName,int numOfNights){
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.numOfNights = numOfNights;
    }

    public void displayRoomDetails(){
        System.out.println("Room Number: " + this.roomNumber);
        System.out.println("Guest Name: " + this.guestName);
        System.out.println("Nights: " + this.numOfNights);
    }

    public double calculateRoomCost() {
        return 150.00 * numOfNights;
    }

    public double calculateRoomCost(int discount){
        double base = calculateRoomCost();
        double totaldiscount = discount * numOfNights;
        return  base - totaldiscount;
    }
}
class StandardRoom extends Room{
    protected boolean wifiIncluded;

    public StandardRoom(){
        super();
        this.wifiIncluded = false;
    }

    public StandardRoom(String roomNumber,String guestName,int numOfNights,boolean wifiIncluded){
        super(roomNumber,guestName,numOfNights);
        this.wifiIncluded = wifiIncluded;
    }
    @Override
    public double calculateRoomCost(){
        return 100 * numOfNights;
    }

    @Override
    public void displayRoomDetails(){
        System.out.println("--- Standard Room ---");
        super.displayRoomDetails();
        if(wifiIncluded == true) {
            System.out.println("Wifi Included: Yes");
        }else{
            System.out.println("Wifi Included: No");
        }
        System.out.println("Total Cost: $" + calculateRoomCost());
        System.out.println("Discounted Cost(per night $10 off): $" + calculateRoomCost(10));
        System.out.println();
    }
}

class LuxurySuite extends Room{
    protected boolean isBreakfastandAirport;

    public LuxurySuite(){
        super();
        this.isBreakfastandAirport = false;
    }

    public LuxurySuite(String roomNumber,String guestName,int numOfNights,boolean isBreakfastandAirport){
        super(roomNumber,guestName,numOfNights);
        this.isBreakfastandAirport = isBreakfastandAirport;
    }

    @Override
    public double calculateRoomCost(){
        double total = 200 * numOfNights;
        if(isBreakfastandAirport){
            return total += 75;
        }else{
            return total;
        }
    }

    @Override
    public void displayRoomDetails(){
        System.out.println("--- Luxury Suite ---");
        super.displayRoomDetails();
        if(isBreakfastandAirport == true){
            System.out.println("Breakfast & Airport Pickup: " + "Included");
        }else{
            System.out.println("Breakfast & Airport Pickup: " + "No");
        }
        System.out.println("Total Cost: $" + calculateRoomCost());
        System.out.println("Discounted Cost (Per night $15 off): $" + calculateRoomCost(15));
    }
}

class HotelApp{
    public static void main(String[] args) {
        StandardRoom st = new StandardRoom();
        LuxurySuite lu = new LuxurySuite("305","Alice Green",3,true);

        st.displayRoomDetails();
        lu.displayRoomDetails();
    }
}