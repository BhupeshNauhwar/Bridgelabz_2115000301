class Book{
    private static  String libraryName="Library";
    
    private final int isbn;
    private String title;
    private String auhor;
    
    public Book(int isbn, String title, String author ){
        this.isbn=isbn;
        this.title=title;
        this.auhor=author;
    }
    public static String  displayLibraryName(){
        return libraryName;
    }
    public void display(){
        System.out.println("Library Name: "+displayLibraryName());
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+auhor+"\n");
    }

}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book1=new Book(1234,"Maths","R.D Sharma");
        Book book2=new Book(1235,"Physics","H.C Verma");
        
        Book.displayLibraryName();
        if (book1 instanceof Book) {
            book1.display();
        }
        if (book2 instanceof Book) {
            book2.display();
        }
    }
    
}