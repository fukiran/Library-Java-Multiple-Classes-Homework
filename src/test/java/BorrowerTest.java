import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("Core Java", "Horstmann", "Computer Book");
    }

    @Test
    public void checkBooksOnBookshelf(){
        assertEquals(0, borrower.howManyBooksOnBookshelf());
    }

    @Test
    public void canBorrowBook(){
    borrower.getBookFromLibrary(book);
    assertEquals(1, borrower.howManyBooksOnBookshelf());
    }
}
