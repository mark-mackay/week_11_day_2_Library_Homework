import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
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
//    public Book borrowBookByName(String name){
//        if (hasBook(name)){
//            for (Book book : this.books){
//                if (book.getName() == name){
//                    this.books.remove(book);
//                    return book;
//                }
//            }
//        }
//    }

}
