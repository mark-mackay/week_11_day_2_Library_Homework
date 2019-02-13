import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> booksByGenre;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
    }


    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int bookCount(){
        return this.books.size();
    }
    public void addBook(Book book){
        if (bookCount() < getCapacity()) {
            this.books.add(book);
        }
    }
    public boolean hasBook(String name){
        for (Book book : this.books) {
            if (book.getName() == name) {
                return true;
            }
        }
        return false;
    }
    public Book getBookByName(String name){
     // Will return book by name or first book in list
        Book booky = new Book("H", "H","Horror");
            for (Book book : this.books){
                if (book.getName() == name) {
                    booky = book;
                    this.books.remove(book);
                }
            }
            return booky;
    }

    public void getStock(){
        for (Book book: this.books){
            String genreForBook = book.getGenre();
            
            if (this.booksByGenre.containsKey(genreForBook)) {
                this.booksByGenre.put(genreForBook, this.booksByGenre.get(genreForBook) + 1);
            }
            else {
                this.booksByGenre.put(book.getGenre(), 1);
            }
        }
    }
//    public int getBooksByGenre(String genre){
//        for (Book book : this.books) {
//
//            this.booksByGenre.put(book.getGenre(), 1);
//        }
//        return this.booksByGenre(genre);
//    }
}
