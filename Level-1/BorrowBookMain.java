class BorrowBook{
    private String title;
    private String author;
    private float price;
    private String availability;
    public BorrowBook(String title, String author, float price, String availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    public void checkBorowBook(){
       
            if (availability.equals("yes") ) {
                System.out.println("you can borrow "+title);
            }else{
                System.out.println("You cannot bororw "+title);
            }
        }
    }


public class BorrowBookMain {
    public static void main(String[] args) {
        BorrowBook book1=new BorrowBook("Maths","R.D sharma" ,450,"yes");
        BorrowBook book2 =new BorrowBook("Physics","H.c.Verma",345,"No");

        book1.checkBorowBook();
        book2.checkBorowBook();
    }
}
