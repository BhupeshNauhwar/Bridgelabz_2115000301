abstract class Product{
	private int productId;
	private String name;
	private float price;
	
	public Product(int productId, String name,float price){
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	
	public int getProductId(){
		return productId;

	}
	public String getName(){
		return name;
	}
	public float getPrice(){
		return price;
	}
	
	public abstract float calculateDiscount();
	
	
}
interface Taxable{
	float calculateTax();
	String getTaxDetails();
}

class Electronics extends Product implements Taxable{
	private final float discountRtae=0.10f;
	private final float taxRate=0.18f;
	
	public Electronics(int productId, String name, float price ){
		super(productId,name,price);
	}
	public float calculateTax(){
		return getPrice()*taxRate;
	}
	public float calculateDiscount(){
		return getPrice()*discountRtae;
	}
	
	public String getTaxDetails(){
		return "Elctronic Tax:"+taxRate*100+"%";
	}
}


class Clothing extends Product implements Taxable{
	private final float discountRtae=0.20f;
	private final float taxRate=0.05f;
	
	public Clothing(int productId, String name, float price ){
		super(productId,name,price);
	}
	public float calculateTax(){
		return getPrice()*taxRate;
	}
	public float calculateDiscount(){
		return getPrice()*discountRtae;
	}
	
	public String getTaxDetails(){
		return "Clothing Tax:"+taxRate*100+"%";
	}
}

class Groceries extends Product implements Taxable{
	private final float discountRtae=0.15f;
	private final float taxRate=0.02f;
	
	public Groceries(int productId, String name, float price ){
		super(productId,name,price);
	}
	public float calculateTax(){
		return getPrice()*taxRate;
	}
	public float calculateDiscount(){
		return getPrice()*discountRtae;
	}
	
	public String getTaxDetails(){
		return "Groceries Tax:"+taxRate*100+"%";
	}
}

public class EcommerceSystem{
	public static void main(String arg[]){
		
		Electronics electronic=new Electronics(123,"Mobile",15000);
		Clothing cloth=new Clothing(234,"Jeans",800);
		Groceries grocerie=new Groceries(654,"apple",500);
		

		calculateFinalPrice(electronic);
		calculateFinalPrice(cloth);
		calculateFinalPrice(grocerie);
		
		
	}
	public static void calculateFinalPrice(Product p){
		float price=p.getPrice();
		String name=p.getName();
		
		float discount=p.calculateDiscount();
		float tax=(p instanceof Taxable)?((Taxable)p).calculateTax():0;
		float totaPprice=price-discount+tax;
		
		System.out.println("Prdouct:"+name);
		System.out.println("Original Price:"+price);
		System.out.println("Discount:"+discount);
		System.out.println("Tax:"+tax);
		System.out.println("Total price:"+totaPprice);
		
		if(p instanceof Taxable){
			System.out.println(((Taxable) p).getTaxDetails()+"\n");
		}
	}
}