import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collectionOfBooks;
    private int capacity;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    public Library(int capacity) {
        this.capacity = capacity;
        this.book = new Book("Core Java", "Horstmann", "Computer Book");
        this.book1 = new Book("Extreme Java", "Kabutz", "Computer Book");
        this.book2 = new Book("Think Java", "Downey", "Computer Book");
        this.book3 = new Book("Selected works", "Lenin", "Fiction");
        this.collectionOfBooks = new ArrayList<Book>();
        this.collectionOfBooks.add(book);
        this.collectionOfBooks.add(book1);
        this.collectionOfBooks.add(book2);
        this.collectionOfBooks.add(book3);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if (this.getNumberOfBooks() < this.getCapacity())
        this.collectionOfBooks.add(book);
    }

    public void removeBook(Book book) {
        this.collectionOfBooks.remove(book);
    }
}
