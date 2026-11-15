package Question2;

public interface Printable {
    void printDetails();
}

class Report implements Printable {

    private String title;
    private String author;

    public Report(String title,String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public void printDetails(){
        System.out.println("Report Title: " + title);
        System.out.println("Report Author: " + author);
    }
}

class Invoice implements Printable {
    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount){
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    @Override
    public void printDetails(){
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Amount: $" + amount);
    }
}

class PrintableApp{
    public static void main(String[] args) {
        Report report1 = new Report("Sales Report","Sandaru");
        Report report2 = new Report("Monthly Report","Bob");

        Invoice invoice1 = new Invoice("Invoice-1234",250.00);
        Invoice invoice2 = new Invoice("Invoice-5678",500.00);

        Printable[] printables = {report1,report2,invoice1,invoice2};

          for(int i=0; i<printables.length; i++){
            printables[i].printDetails();
            System.out.println();
        }
    }
}
