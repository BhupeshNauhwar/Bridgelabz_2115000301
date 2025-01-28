import java.util.Scanner;

class Calculation{
    public static int findTallest(double height[]){
        int indextallest=0;
        for (int i = 0; i < height.length; i++) {
            
                if (height[i]>indextallest) {
                    indextallest=i;
                }
            }
            
        
    return indextallest;    
    }
    public static int findYoungest(int age[]){
        int indexyoungest=0;
        for (int i = 0; i < age.length; i++) {
          
                if (age[i]<indexyoungest) {
                    indexyoungest=i;
                }
            }
            
        
    return indexyoungest;    
    }
}
public class AgeAndHieght {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        int size=3;
        int age[]=new int[size];
        double height[]=new double[size];
        String name[]={"Amar","Akbar","Anthony"};
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter hieght of "+name[i]);
            height[i]=sc.nextDouble();
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age of "+name[i]);
            age[i]=sc.nextInt();
        }
        int young=cal.findYoungest(age);
        int tall=cal.findTallest(height);
        System.out.println(" Yongest is "+name[young]+" with age "+age[young]);
        System.out.println(" Tallest is "+name[tall]+" with height "+height[tall]);
    }
}
