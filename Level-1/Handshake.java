import java.util.Scanner;

class Calcultion{
    public int possibleHandshake(int num){
        int value= (num * (num - 1)) / 2;
        return value;
    }
}
public class Handshake {
    public static void main(String[] args) {
        Calcultion cal=new Calcultion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int students=sc.nextInt();
        cal.possibleHandshake(students);

        int TotalHandshakes= cal.possibleHandshake(students);
        System.out.println("The total possible handshake of "+students+ " is "+TotalHandshakes);

    }
}
