class Book{
    public String title;
    public int publicationYear;

    public Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void displayInfo(){
        System.out.println("Title of the book is "+title+"and published in "+publicationYear);
    }

}
class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationYear,String name, String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author of book is "+name+" bio: "+bio);
    }
}

public class LibraryManagementwithBooksandAuthors{
    public static void main(String[] args) {
        Book b1=new Author("Math", 1880, "R.D Sharma", "Extra book for pratice") ;
        
        b1.displayInfo();
    }
}