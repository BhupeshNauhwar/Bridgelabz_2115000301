import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int size=sc.nextInt();
        double physics[]=new double[size];
        double maths[]=new double[size];
        double chemistry[]=new double[size];
        double avg[]=new double[size];
        double percentage[]=new double[size];

        for (int i = 0; i < size; i++) {
           while (true) {
            System.out.println("Enter Physics Marks");
            physics[i]=sc.nextDouble();
            if (physics[i]<0) {
                
                    System.out.println("Enter Postive value");
            }
            else{
                  break;
            }
            }
           
           while (true) {
            System.out.println("Enter chemistry Marks");
            chemistry[i]=sc.nextDouble();
            if (chemistry[i]<0) {
                
                    System.out.println("Enter Postive value");
            }
            else{
                  break;
            }
            }
           
           while (true) {
            System.out.println("Enter maths Marks");
            maths[i]=sc.nextDouble();
            if (maths[i]<0) {
                
                    System.out.println("Enter Postive value");
            }
            else{
                  break;
            }
            }
        }
        for (int i = 0; i < percentage.length; i++) {
                double obtained=maths[i]+chemistry[i]+physics[i];
                avg[i]=obtained/3;
                percentage[i]=obtained/300*100;
                if (percentage[i]>=80) {
                    System.out.println("Level 4, above agency-normalized standards"+" and averrage marks are "+avg[i] );
                  } else if (percentage[i]>=70 && percentage[i]<=79) {
                    System.out.println("Level 3, at agency-normalized standards"+" and averrage marks are "+avg[i] );
                  }else if (percentage[i]>=70&& percentage[i]<=69) {
                    System.out.println("Level 2, below, but approaching agency-normalized standards"+" and averrage marks are "+avg[i] );
                  }else if (percentage[i]>=50&& percentage[i]<=59) {
                    System.out.println("Level 1, well below agency-normalized standards"+" and averrage marks are "+avg[i] );
                  }else if (percentage[i]>=40&& percentage[i]<=49) {
                    System.out.println("Level 1, to below  agency-normalized standards"+" and averrage marks are "+avg[i] );
                  }
                  else{
                    System.out.println("Remedial Standards"+" and averrage marks are "+avg[i] );
        }

        
        }
        
    }
}
