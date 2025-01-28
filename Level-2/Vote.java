import java.util.Scanner;

class Calculation{
    public boolean canStudentVote(int age){
        if (age>=18) {
            return true;
        }
    return false;    
    }
}
public class Vote {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc= new Scanner(System.in);
        int size=10;
        int age[]=new int[size];
        System.out.println("Enter age of 10 candidate");
        
        for (int i = 0; i < age.length; i++) {
            age[i]=sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            if (cal.canStudentVote(age[i])) {
                System.out.println("Student "+(i+1)+" can vote");
            }else{
                System.out.println("Student "+(i+1)+" cannot vote");
            }
        }
    }
}
