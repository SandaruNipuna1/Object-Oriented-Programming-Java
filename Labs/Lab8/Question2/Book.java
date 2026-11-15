package Question2;

public class Book {
    private String isbn;
    private String title;
    private Library library;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public void setLibrary(Library lib){
        this.library = lib;
    }

    public void displayBookDetails(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        if(library != null){
            System.out.println("Library Name: " + library.getLibraryName());
        }else{
            return;
        }
    }

}
