import java.util.*;

abstract class LibraryItem{
	private int itemId;
	private String author;
	private String title;
    private boolean isAvailable;

	public LibraryItem(int itemId, String author,String title){
		this.itemId=itemId;
		this.author=author;
        this.title=title;
        this.isAvailable=true;
	}

	public int getItemId(){
		return itemId;

	}

	public String getAuthorName(){
		return author;
	} 
	public String getTitle(){
		return title;
	} 
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailability(boolean avilable){
        this.isAvailable=avilable;
    }

	public void getItemDetails(){
        System.out.println("Item Id:"+itemId);
        System.out.println("Author :"+author);
        System.out.println("Title:"+title);
        
    }
	
    public abstract int getLoanDuration();
}

interface Reservable{
	void reserveItem();
	boolean checkAvailability();
}

class  Book extends LibraryItem implements Reservable{
	

	public Book(int itemId, String author,String title){
		super(itemId, author, title);
        
	}
    public int getLoanDuration(){
        return 14;
    }
    public void reserveItem(){
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println(getTitle()+" is reserved");
        }
        else{
            System.out.println(getTitle()+" is not available");
        }
    }
    public boolean checkAvailability(){
        return isAvailable();
    }
}

class  Magazine extends LibraryItem implements Reservable{
	

	public Magazine(int itemId, String author,String title){
		super(itemId, author, title);
        
	}
    @Override
    public int getLoanDuration(){
        return 10;
    }
    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class  DVD extends LibraryItem implements Reservable{
	

	public DVD(int itemId, String author,String title){
		super(itemId, author, title);
        
	}
    @Override
    public int getLoanDuration(){
        return 5;
    }
    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setAvailability(false);
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryManagementSystem{
	public static void main(String args[]){
        List<LibraryItem> libraryItems=new ArrayList<>();
        libraryItems.add(new Book(010, "asdt", "MAths"));
        libraryItems.add(new Magazine(34567, "Rahul", "Science"));
        libraryItems.add(new DVD(3456, "Jhon", "Games"));

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration:"+item.getLoanDuration());


            if (item instanceof Reservable) {
                Reservable r=(Reservable)item;
                System.out.println("Check availabilty:"+(r.checkAvailability()?"Available":"Not Available"));
                r.reserveItem();
                System.out.println();
            }
        }
	}
}

