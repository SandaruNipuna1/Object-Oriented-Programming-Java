package Question2;

public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library("Metro");

        Book book1 = new Book("130","Sherlock Holmes");
        Book book2 = new Book("155","Marvel");
        Book book3 = new Book("178","DC");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayLibraryDetails();
    }
}
