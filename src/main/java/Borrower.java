import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookshelf;




    public Borrower(){
        this.bookshelf = new ArrayList<Book>();
    }
    public int howManyBooksOnBookshelf() {
        return this.bookshelf.size();
    }

    public void getBookFromLibrary(Book book, Library library) {
        library.removeBook(book);
        this.bookshelf.add(book);
    }
}
