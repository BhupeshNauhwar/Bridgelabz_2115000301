import java.util.Scanner;

public class Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int totalStudents=sc.nextInt();
        int age[]=new int[totalStudents];
        System.out.println("Enter ages of Students");
        for (int i = 0; i < age.length; i++) {
            age[i]=sc.nextInt();
        }

        for (int i = 0; i < age.length; i++) {
            if (age[i]<0) {
                System.out.println("Invalid age");
            }else if (age[i]>=18) {
                System.out.println("The student with the age "+ age[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+ age[i]+" cannot vote");
            }
        }
    }
}