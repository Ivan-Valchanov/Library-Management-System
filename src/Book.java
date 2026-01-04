public class Book {

    String title;
    String author;
    String publisher;
    int year;
    int pages;
    int price;
    String isbn;
    boolean available;

    public Book(String title, String author, String publisher, int year, int pages, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
