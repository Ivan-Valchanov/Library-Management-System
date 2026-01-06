import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title) && book.available) {
                book.available = false;
                System.out.println("Your book has been borrowed." + title);
                return;
            }
        }
        System.out.println("Sorry, book is not available");
    }





    public void showBooks() {
        if(books.isEmpty()) {
            System.out.println("No books available");
        }
        else {
            books.forEach(System.out::println);
        }
    }
}
