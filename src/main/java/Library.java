import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collectionOfBooks;
    private int capacity;

    public Library(int capacity) {
        this.collectionOfBooks = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfBooks() {
        return collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if (this.getNumberOfBooks() < this.getCapacity())
        collectionOfBooks.add(book);
    }
}
