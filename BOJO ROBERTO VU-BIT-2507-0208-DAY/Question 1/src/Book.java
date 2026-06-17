public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book() {
        available = true;
    }
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = "Unknown";
        this.available = true;
    }
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = "author";
        this.available = true;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;    
    }
    public String getAuthor() {
        return author;
     }   
    public boolean isAvailable() {
        return available;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Book [isbn=" + isbn +
                ", title=" + title +
                ", author=" + author +
                ", available=" + available + "]";
    }
    }

