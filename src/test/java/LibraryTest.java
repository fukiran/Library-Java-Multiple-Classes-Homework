import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        book = new Book("Core Java", "Horstmann", "Computer Book");
        library = new Library(2);

    }



    @Test
    public void hasCollectionOfBooks(){
        assertEquals(0, this.library.getNumberOfBooks());
    }


    @Test
    public void canAddBook(){
        this.library.addBook(book);
        assertEquals(1, this.library.getNumberOfBooks());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, this.library.getCapacity());
    }

    @Test
    public void cantAddOverCapacity() {
        this.library.addBook(book);
        this.library.addBook(book);
        this.library.addBook(book);
        assertEquals(2,this.library.getNumberOfBooks());
    }
}
