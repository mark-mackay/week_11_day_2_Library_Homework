import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

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

    }

    @Test
    public void libraryHasName(){
        assertEquals("Leith", library.getName());
    }

    @Test
    public void libraryHasACapacity(){
        assertEquals(20, library.getCapacity());
    }

    @Test
    public void canCountBooks(){
        assertEquals(5, library.bookCount());
    }
    @Test
    public void canAddBook() {
        library.addBook(book6);
        assertEquals(6, library.bookCount());
    }
    @Test
    public void cantAddBookAtCapacity() {
        assertEquals(5, library1.bookCount());
        assertEquals(5, library1.getCapacity());
        library.addBook(book6);
        assertEquals(5, library1.bookCount());
    }
    @Test
    public void testHasBook_true() {
        assertEquals(true, library.hasBook("The Rats"));
    }
    @Test
    public void testHasBook_false() {
        assertEquals(false, library.hasBook("Boing"));
    }
//    @Test
//    public void canRemovePassengerFromBus(){
//        bus.addPassenger();
//        assertEquals(1, bus.passengerCount());
//        bus.removePassenger();
//        assertEquals(0, bus.passengerCount());
//    }
//
//    @Test
//    public void canAddPassengersFromQueue(){
//        assertEquals(3, busStop.getQueueSize());
//        bus.addPassengerFromQueue(busStop);
//        assertEquals(1, bus.passengerCount());
//        assertEquals(2, busStop.getQueueSize());
//    }
//    @Test
//    public void cantAddPassengersFromQueue(){
//        assertEquals(3, busStop.getQueueSize());
//        bus1.addPassengerFromQueue(busStop);
//        bus1.addPassengerFromQueue(busStop);
//        assertEquals(1, bus1.passengerCount());
//        assertEquals(2, busStop.getQueueSize());
//    }
}
