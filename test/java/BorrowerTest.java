import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library("Leith", 20);
        library1 = new Library("Wester Hailes", 5);
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("The Pyschopath Test", "Jon Ronson", "Comedy");
        book3 = new Book("The Shawshank Redemption", "Stephen King", "Drama");
        book4 = new Book("The Rats", "James Herbert", "Horror");
        book5 = new Book("Propaganda Blitz", "Media Lens", "Current Affairs");
        book6 = new Book("It", "Stephen King", "Horror");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        borrower = new Borrower("Mark");
    }
    @Test
    public void canBorrowBook(){
        borrower.getBook(library, "The Rats");
        assertEquals(true, borrower.hasBook("The Rats"));
        assertEquals(false, library.hasBook("The Rats"));
    }
}
