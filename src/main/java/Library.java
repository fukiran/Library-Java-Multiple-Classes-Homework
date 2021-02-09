import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collectionOfBooks;

    public Library() {
        this.collectionOfBooks = new ArrayList<Book>();
    }

    public int getNumberOfBooks() {
        return collectionOfBooks.size();
    }

    public void addBook(Book book) {
        collectionOfBooks.add(book);
    }
}
