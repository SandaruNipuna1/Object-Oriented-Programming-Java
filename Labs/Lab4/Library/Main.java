package Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("JAVA","JOHN");
        Book book2 = new Book("JAVA","JOHN","1234");
        Book book3 = new Book("JAVA","JOHN","1234",4500.00);

        System.out.println(book1.getBookDetails());
        System.out.println(book2.getBookDetails("1234"));
        System.out.println(book3.getBookDetails());
    }
}
