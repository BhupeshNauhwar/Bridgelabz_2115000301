class Book{
    private String title;
    private String author;
    private float price;
    public Book(String title,String author, float price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String getName(){
        return title;
    }
    public void displayDetails(){
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
        System.out.println("Price is "+price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b1=new Book("Physics", "H.C Verma", 345);
        Book b2=new Book("Maths ", "R.D Sharma", 650);
        
        System.out.println("Details of book:"+b1.getName());
        b1.displayDetails();
        System.out.println();
        System.out.println("Details of book:"+b2.getName());
        b2.displayDetails();
    }
    
    
}
