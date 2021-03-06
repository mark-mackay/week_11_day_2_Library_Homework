import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void getBook(Library library, String name){
        if (library.hasBook(name)) {
            books.add(library.getBookByName(name));
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

}
