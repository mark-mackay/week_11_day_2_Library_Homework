import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before() {
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("The Pyschopath Test", "Jon Ronson", "Comedy");
        book3 = new Book("The Shawshank Redemption", "Stephen King", "Drama");
        book4 = new Book("The Rats", "James Herbert", "Horror");
        book5 = new Book("Propaganda Blitz", "Media Lens", "Current Affairs");
        book6 = new Book("It", "Stephen King", "Horror");
    }

    @Test
    public void bookHasName(){
        assertEquals("The Shining", book1.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Jon Ronson", book2.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Horror", book6.getGenre());
    }

}
