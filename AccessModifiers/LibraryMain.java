class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        EBook ebook1 = new EBook("978-0-321-87758-1", "Effective Java", "Joshua Bloch", 5.2);

        book1.displayBookDetails();
        ebook1.displayEBookDetails();

        book1.setAuthor("Jane Smith");
        System.out.println("Updated Author of " + book1.title + ": " + book1.getAuthor());
    }
}
