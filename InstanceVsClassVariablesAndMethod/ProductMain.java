
class Product {
    private String productName;
    private float price;
    private static int totalProduct;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
        totalProduct++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProduct);
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 42000);
        Product p2 = new Product("Smartphone", 15000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

