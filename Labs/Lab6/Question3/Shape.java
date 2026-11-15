package Question3;

public class Shape {
    private String shapeName;

    //default constructor
    public Shape(){
        this.shapeName = "N/A";
    }

    //parameterized constructor
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    //display method
    public void displayShapeDetails(){
        System.out.println("Shape Name: " + this.shapeName);
    }

    public double calculateArea(){
        return 0.0;
    }

    //overloading calculateArea
    public double calculateArea(double factor){
        double defArea = calculateArea();
        return defArea * factor;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;

    //default constructor
    public Rectangle(){
        this.length = 0.00;
        this.width = 0.00;
    }

    //parameterized constructor
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    //override calculateArea method
    @Override
    public double calculateArea(){
        return length * width;
    }

    //override the displayShapeDetails
    @Override
    public void displayShapeDetails(){
        super.displayShapeDetails();
        System.out.println("Area: " + calculateArea());
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    //default constructor
    public Triangle(){
        this.base = 0.00;
        this.height = 0.00;
    }

    //parameterized constructor
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    //override calculateArea method
    @Override
    public double calculateArea(){
        return (base * height) / 2;
    }

    @Override
    //display method
    public void displayShapeDetails(){
        super.displayShapeDetails();
        System.out.println("Area: " + calculateArea());
    }

    //implementing main method
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle(5,10);

        //call overloaded Rectangle calculateArea method
        System.out.println("Area: " + r.calculateArea());
        //call overload Triangle calculateArea method
        System.out.println("Area: " + t.calculateArea());
        System.out.println();
        r.displayShapeDetails();
        System.out.println();
        t.displayShapeDetails();
    }
}