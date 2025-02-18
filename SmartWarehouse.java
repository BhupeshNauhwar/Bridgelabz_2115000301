import java.util.*;
abstract class WarehouseItem{
	private String name;
	
	public WarehouseItem(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void displayDetails();
}

class  Electronics extends WarehouseItem{
	private String brand;
	public Electronics(String name, String brand){
		super(name);
		this.brand=brand;
	}
	@Override
	public void displayDetails(){
		System.out.println(" Name:"+getName
		());
		System.out.println("Brand:"+brand);
	}
}

class  Groceries extends WarehouseItem{
	private String expiryDate;
	public Groceries(String name, String expiryDate){
		super(name);
		this.expiryDate=expiryDate;
	}
	@Override
	public void displayDetails(){
		System.out.println(" Name:"+getName
		());
		System.out.println("Expiry Date:"+expiryDate);
	}
}

class  Furniture extends WarehouseItem{
	private String material;
	public Furniture(String name, String material){
		super(name);
		this.material=material;
	}
	@Override
	public void displayDetails(){
		System.out.println(" Name:"+getName
		());
		System.out.println("Material :"+material);
	}
}

class Storage<T extends WarehouseItem>{
		private List<T> items=new ArrayList<>();
		
		public void addItem(T item){
			items.add(item);
		}
		
		public List<T> getItems(){
			return items;
		}
} 

class WarehouseUtil{
	public static void displayItems(List<? extends WarehouseItem> items){
		for(WarehouseItem item: items){
			item.displayDetails();
		}
	}
}
public class SmartWarehouse{
	public static void main(String args[]){
		Storage<Electronics> electronic=new Storage<>();
		Storage<Groceries> groceries=new Storage<>();
		Storage<Furniture> furniture=new Storage<>();
		
		electronic.addItem(new Electronics("Mobile","Vivo"));
		electronic.addItem(new Electronics("Laptop", "Asus"));
		
		groceries.addItem(new Groceries("Milk","20-2-25"));
		groceries.addItem(new Groceries("Bread","21-2-25"));
		
		furniture.addItem(new Furniture("Chair", "Wood"));
		furniture.addItem(new Furniture("Table","Metal"));
		
		System.out.println("Electronics:");		WarehouseUtil.displayItems(electronic.getItems());
		
		
		System.out.println("Furniture:");		WarehouseUtil.displayItems(furniture.getItems());
		
		
		System.out.println("Groceries:");		WarehouseUtil.displayItems(groceries.getItems());
	}	
		
}
