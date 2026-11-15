package Question2;

public class Membership {

    //attributes
    private String membershipID;
    private String memberName;
    private int durationMonths;

    //default constructor
    public Membership(){
        this.membershipID = "N/A";
        this.memberName = "N/A";
        this.durationMonths = 0;
    }

    //parameterized constructor
    public Membership(String membershipID,String memberName,int durationMonths){
        this.membershipID = membershipID;
        this.memberName = memberName;
        this.durationMonths = durationMonths;
    }

    //display method
    public void displayMembershipDetails(){
        System.out.println("Membership ID: " + this.membershipID);
        System.out.println("Member Name: " + this.memberName);
        System.out.println("Duration Months: " + this.durationMonths);
    }

    //implementing calculateFee method
    public double calculateFee(){
        return 5000.00;
    }

    //overload calculateFee method
    public double calculateFee(double discountPercentage){
        double base = calculateFee();
        double discount = base * (discountPercentage/100);
        return base - discount;
    }

    public int getDurationMonths(){
        return this.durationMonths;
    }
}
class BasicMembership extends Membership{
    private boolean hasGymAccesss;

    //default constructor
    public BasicMembership(){
        super();
        this.hasGymAccesss = false;
    }

    //parameterized constructor
    public BasicMembership(String membershipID,String memberName,int durationMonths, boolean hasGymAccesss){
        super(membershipID,memberName,durationMonths);
        this.hasGymAccesss = hasGymAccesss;
    }

    //overriding calculateFee method
    @Override
    public double calculateFee(){
        return 200 * getDurationMonths();
    }

    //overriding displayMembershipDetails method
    @Override
    public void displayMembershipDetails(){
        super.displayMembershipDetails();
        System.out.println("Total Fee: " + calculateFee());
        System.out.println("Gym Access Status: " + this.hasGymAccesss);
    }
}
class PremiumMembership extends Membership{
    private boolean includePersonalTraining;

    //default constructor
    public PremiumMembership(){
        super();
        this.includePersonalTraining = false;
    }

    //parameterized constructor
    public PremiumMembership(String membershipID,String memberName,int durationMonths,boolean includePersonalTraining){
        super(membershipID,memberName,durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }

    //override calculateFee
    @Override
    public double calculateFee(){
        double total = 300  * getDurationMonths();
        if(includePersonalTraining)
            return total + 100;
        else
            return total;
    }
    @Override
    public void displayMembershipDetails(){
        super.displayMembershipDetails();
        System.out.println("Total Fee: " + calculateFee());
        System.out.println("Personal Training Status: " + this.includePersonalTraining);
    }
}
class MembershipApp{
    public static void main(String[] args) {
        BasicMembership b = new BasicMembership();
        PremiumMembership p = new PremiumMembership("P1001","JACK",5,true);

        System.out.print("Basic Membership Overloaded calculateFee: ");
        System.out.println(b.calculateFee(20));
        System.out.print("Premium Membership Overloaded calculateFee: ");
        System.out.println(p.calculateFee(30));
        System.out.println();
        b.displayMembershipDetails();
        System.out.println();
        p.displayMembershipDetails();
    }
}