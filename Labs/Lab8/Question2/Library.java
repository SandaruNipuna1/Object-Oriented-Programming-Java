package Question2;

public class Library {
    private String libraryName;
    private int bookCount = 0;
    Book[] books = new Book[3];

    public Library(String libraryName){
        this.libraryName = libraryName;
    }

    public String getLibraryName(){
        return libraryName;
    }

    public void addBook(Book book){
        if(bookCount < 3){
            books[bookCount] = book;
            book.setLibrary(this);
            bookCount++;
        }else{
            System.out.println("Maximum Limit Reached!");
        }
    }

    public void displayLibraryDetails(){
        System.out.println("Library Name: " + libraryName);
        for(int i=0; i<bookCount; i++){
            books[i].displayBookDetails();
        }
    }
}
