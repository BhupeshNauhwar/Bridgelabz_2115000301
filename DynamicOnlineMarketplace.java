import java.util.*;
class Product<T>{
	private String name;
	private  float price;
	private T category;
	
	public Product(String name, float price, T category){
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	public String getName(){
		return name;
		
	}
	public float getPrice(){
		return price;
	}
	public T getCategory(){
		return category;
	}
	public void setPrice(float price){
		
		this.price=price;
	}
	public String toString() {
    return "Product Name:" + name + ", Price:" + price + ", Category:" + category.getClass().getSimpleName();
}
	
}

interface BookCategory{};
interface ClothingCategory{};

class Fiction implements BookCategory{}
class Formal implements ClothingCategory{}


class DiscountUtil{
	public static <T extends Product<?>> void applyDiscount(T product, float percentage){
		float discountAmount= (product.getPrice()*percentage)/100;
		product.setPrice(product.getPrice()-discountAmount);
		System.out.println("New price of "+product.getName()+" is  "+product.getPrice());
	}
}

class ProductCatalog{
	private ArrayList<Product<?>> catalog=new ArrayList<>();
	
	public void addProduct(Product<?> product){
		catalog.add(product);
	}
	public void displayCatalog(){
		for(Product<?> p:catalog){
			System.out.println(p);
		}
	}
}

public class DynamicOnlineMarketplace{
	public static void main(String args[]){
		
		Product<BookCategory> book=new Product<>("Maths",20, new Fiction());
		Product<ClothingCategory> shirt=new Product<>("Formal Shirt",50, new Formal());
		
		ProductCatalog pc=new ProductCatalog();
		pc.addProduct(book);
		pc.addProduct(shirt);
		
		System.out.println("Price before discount:");
		pc.displayCatalog();
		
		DiscountUtil.applyDiscount(book,10);
		DiscountUtil.applyDiscount(shirt,15);
		
		System.out.println("Price after discount:");
		pc.displayCatalog();
		
	}
}