import java.util.*;

class ShoppingCart {
    private HashMap<String, Double> productPrices;
    private LinkedHashMap<String, Integer> cart;
    private TreeMap<Double, String> sortedByPrice;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedByPrice = new TreeMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        sortedByPrice.put(price, product);
    }

    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            System.out.println(quantity + "x " + product + " added to cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayCart() {
        System.out.println("\nCart Items (Order of Adding):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue() + ", Price: $" + productPrices.get(entry.getKey()));
        }
    }

    public void displaySortedByPrice() {
        System.out.println("\nProducts Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " -> Price: $" + entry.getKey());
        }
    }

    public void displayTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("\nTotal Cost: $" + total);
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 800);
        cart.addProduct("Phone", 500);
        cart.addProduct("Headphones", 100);
        cart.addProduct("Mouse", 50);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Mouse", 3);

        cart.displayCart();
        cart.displaySortedByPrice();
        cart.displayTotal();
    }
}
