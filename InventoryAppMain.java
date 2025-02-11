import java.util.*;

class ItemNode {
    String itemName;
    int itemId, quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private ItemNode head = null;

    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }

    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if (position < 1) return;
        if (position == 1) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        ItemNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;
        if (temp == null) return;
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeItem(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        ItemNode temp = head, prev = null;
        while (temp != null && temp.itemId != itemId) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) prev.next = temp.next;
    }

    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchItemById(int itemId) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item: " + temp.itemName + " | ID: " + temp.itemId +
                        " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchItemByName(String itemName) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item: " + temp.itemName + " | ID: " + temp.itemId +
                        " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        ItemNode temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    private ItemNode mergeSort(ItemNode head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null) return head;
        ItemNode mid = getMiddle(head), secondHalf = mid.next;
        mid.next = null;
        return merge(mergeSort(head, sortByName, ascending), mergeSort(secondHalf, sortByName, ascending), sortByName, ascending);
    }

    private ItemNode merge(ItemNode left, ItemNode right, boolean sortByName, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;
        boolean condition = sortByName
                ? left.itemName.compareToIgnoreCase(right.itemName) < 0
                : left.price < right.price;
        if (!ascending) condition = !condition;
        if (condition) {
            left.next = merge(left.next, right, sortByName, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, sortByName, ascending);
            return right;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void sortInventory(boolean sortByName, boolean ascending) {
        head = mergeSort(head, sortByName, ascending);
    }

    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.itemName + " | ID: " + temp.itemId +
                    " | Quantity: " + temp.quantity + " | Price: $" + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Item Quantity");
            System.out.println("6. Search Item by ID");
            System.out.println("7. Search Item by Name");
            System.out.println("8. Calculate Total Inventory Value");
            System.out.println("9. Sort Inventory by Name (Ascending)");
            System.out.println("10. Sort Inventory by Name (Descending)");
            System.out.println("11. Sort Inventory by Price (Ascending)");
            System.out.println("12. Sort Inventory by Price (Descending)");
            System.out.println("13. Display Inventory");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    inventory.addItemAtBeginning(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    inventory.addItemAtEnd(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Name, ID, Quantity, Price, Position: ");
                    inventory.addItemAtPosition(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID to Remove: ");
                    inventory.removeItem(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter ID and New Quantity: ");
                    inventory.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter ID to Search: ");
                    inventory.searchItemById(sc.nextInt());
                    break;
                case 7:
                    System.out.print("Enter Name to Search: ");
                    inventory.searchItemByName(sc.next());
                    break;
                case 8:
                    inventory.calculateTotalValue();
                    break;
                case 9:
                    inventory.sortInventory(true, true);
                    break;
                case 10:
                    inventory.sortInventory(true, false);
                    break;
                case 11:
                    inventory.sortInventory(false, true);
                    break;
                case 12:
                    inventory.sortInventory(false, false);
                    break;
                case 13:
                    inventory.displayInventory();
                    break;
                case 14:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 14);

        sc.close();
    }
}
