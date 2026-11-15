package Question1;

    public class Course {

        //attributes
        private String courseID;
        private String courseName;
        protected int durationWeeks;

        //default constructor
        public Course(){
            this.courseID = "N/A";
            this.courseName = "N/A";
            this.durationWeeks = 0;
        }

        //parameterized constructor
        public Course(String courseID, String courseName, int durationWeeks){
            this.courseID = courseID;
            this.courseName = courseName;
            this.durationWeeks = durationWeeks;
        }

        //implementing displayCourseDetails method
        public void displayCourseDetails(){
            System.out.println("Course ID: " + this.courseID);
            System.out.println("Course Name: " + this.courseName);
            System.out.println("Duration : " + this.durationWeeks + " weeks");
        }

        //implement calculateTotalFee method
        public double calculateTotalFee(){
            return 10000.00;
        }

        //overload calculateTotalFee method
        public double calculateTotalFee(double discountPercentage){
            double basic = calculateTotalFee();
            double discount = basic*(discountPercentage/100);
            return basic - discount;
        }
    }
    class RegularCourse extends Course {
        //assigning new attribute
        private boolean hasLiveSessions;

        //default constructor
        public RegularCourse(){
            super(); //courseID,courseName,duration
            this.hasLiveSessions = false;
        }

        //parameterized constructor
        public RegularCourse(String courseID, String courseName, int durationWeeks, boolean hasLiveSessions){
            super(courseID,courseName,durationWeeks);
            this.hasLiveSessions = hasLiveSessions;
        }

        //overriding calculateTotalFee method
        @Override
        public double calculateTotalFee(){
            return 100 * durationWeeks;
        }

        //overriding displayCourseDetails method

        @Override
        public void displayCourseDetails(){
            System.out.println("=== Regular Course (Default Constructor) ===");
            super.displayCourseDetails();
            System.out.println("Live Sessions Included: " + this.hasLiveSessions);
            System.out.println("Total Fee: $" + calculateTotalFee());
            System.out.println("Basic Fee: $" + calculateTotalFee());
            System.out.println("Discounted Fee (10%): $" + calculateTotalFee(10));
        }
    }
    class PremiumCourse extends Course{
        //assigning new attribute
        private boolean includeCertification;

        //default constructor
        public PremiumCourse(){
            super();
            this.includeCertification = false;
        }

        //overloaded constructor
        public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertification){
            super(courseID,courseName,durationWeeks);
            this.includeCertification = includeCertification;
        }

        @Override
        public double calculateTotalFee() {
            double total = 150 * durationWeeks;  // Fee per week * weeks
            if (includeCertification) {
                total += 50;  // Add certification fee if included
            }
            return total;
        }

        //overload calculateTotalFee method
        public double calculateTotalFee(double discountPercentage){
            double total = calculateTotalFee();
            double discount = total * (discountPercentage/100);
            return total - discount;
        }

        @Override
        public void displayCourseDetails() {
            System.out.println("=== Premium Course (Parameterized Constructor) ===");
            super.displayCourseDetails();
            System.out.println("Certification Included: " + this.includeCertification);
            System.out.println("Total Fee: $" + calculateTotalFee());
            System.out.println("Basic Fee: $" + calculateTotalFee());
            System.out.println("Discounted Fee (20%): $" + calculateTotalFee(20));
        }
    }
    class Main{
        public static void main(String[] args) {
            RegularCourse regular = new RegularCourse();
            PremiumCourse premium = new PremiumCourse("PC202","Machine Learning",6,true);

            regular.displayCourseDetails();
            System.out.println();
            premium.displayCourseDetails();
        }
    }