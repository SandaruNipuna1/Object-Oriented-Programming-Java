package Library;

public class Book {
    String title, author, ISBN;
    double prize;

    //Constructor1
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Constructor2
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //Constructor3
    Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.prize = price;
    }

    String getBookDetails() {
        return "title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Prize: " + prize;
    }

    String getBookDetails(String ISBN) {
        return "title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Prize: " + prize;
    }
}