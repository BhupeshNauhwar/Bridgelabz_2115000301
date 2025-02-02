class Book{
    private String title;
    private String author;
    private float price;
    public Book(){
        this.title="unknown";
        this.author="unknown";
        this.price=200;

    }
    public Book(String titile, String author, float price){
        this.title=titile;
        this.author=author;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Title of book:"+title);
        System.out.println("Author of book:"+author);
        System.out.println("Price of book:"+price+"\n");

    }
    public String getTitle(){
        return title;
    }
}
public class ParameterAndDefaultConstructors {
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book("Maths","R.D Sharma",650);

        System.out.println("Details of book:"+book1.getTitle()+"using default constructer");
        book1.displayDetails();
        System.out.println("Details of book:"+book2.getTitle()+"using paramterised constructer");
        book2.displayDetails();
       
    }
    
}