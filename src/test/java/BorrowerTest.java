import org.junit.Before;
import org.junit.Test;

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

//    @Test
//    public void canBorrowBook(){
//
//    }
}
