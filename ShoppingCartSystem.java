class Product{
    private static float discount=5;

    private final int productId;
    private String productName;
    private float price;
    private int quantity;

    public Product(String productName, float price, int quantity, int productId){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }
    public static void updateDiscount(float newDiscount){
        discount=newDiscount;

    }
    public float findNewPrice(int quantity){
        float priceOFOne=price-price*discount/100; 
        return priceOFOne*quantity;   
    }
    public void display(){
        System.out.println("Product ID:"+productId);
        System.out.println("Product Name:"+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount: "+discount);
        System.out.println("Total after discount: "+findNewPrice(quantity)+"\n");        
    }
    
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1=new Product("Laptop", 550000, 1, 123);
        Product p2=new Product("Mobile", 25000, 2, 124);
        
        
        if (p1 instanceof Product){
            p1.display();
            
        }
        Product.updateDiscount(20);

        if (p2 instanceof Product){
            p2.display();
            
        }
    }
}
    
