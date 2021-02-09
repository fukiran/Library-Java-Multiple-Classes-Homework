import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Core Java", "Horstmann", "Computer Book");
    }
    @Test
    public void hasTitle(){
        assertEquals("Core Java", this.book.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("Horstmann",this.book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Computer Book",this.book.getGenre());
    }
}
