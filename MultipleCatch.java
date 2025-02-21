import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            Integer[] array = new Integer[size];
            
            System.out.print("Enter the index to retrieve: ");
            int index = scanner.nextInt();
            
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
