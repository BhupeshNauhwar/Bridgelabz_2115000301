import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be greater than zero.");
        }
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 20) {
            discount = discountPercentage;
        } else {
            System.out.println("Invalid discount! Only up to 20% allowed.");
        }
    }

    @Override
    public String getDiscountDetails() {
        return discount > 0 ? "Discount applied: " + discount + "%" : "No discount applied.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.additionalCharge = 10;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 15) {
            discount = discountPercentage;
        } else {
            System.out.println("Invalid discount! Only up to 15% allowed.");
        }
    }

    @Override
    public String getDiscountDetails() {
        return discount > 0 ? "Discount applied: " + discount + "%" : "No discount applied.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        System.out.println("\nProcessing Order for: " + item.getItemName());
        item.getItemDetails();
        System.out.println("Total Price: $" + item.calculateTotalPrice());

        if (item instanceof Discountable) {
            Discountable discountableItem = (Discountable) item;
            discountableItem.applyDiscount(10);
            System.out.println(discountableItem.getDiscountDetails());
            System.out.println("Final Price after Discount: $" + item.calculateTotalPrice() * 0.9);
        }
       }

    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();
        orderList.add(new VegItem("Paneer Tikka", 8.50, 2));
        orderList.add(new NonVegItem("Chicken Biryani", 12.99, 1));

        for (FoodItem item : orderList) {
            processOrder(item);
        }
    }
}
