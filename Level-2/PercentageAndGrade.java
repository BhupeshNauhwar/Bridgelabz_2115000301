import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in); 
      System.out.println("Enter marks of physicis");
      int physicis=sc.nextInt();
      System.out.println("Enter marks of chemistry");
      int chemistry=sc.nextInt();
      System.out.println("Enter marks of maths");
      int maths=sc.nextInt();
      float totalObtained=physicis+chemistry+maths;
      float totalMarks=300;
      float average=totalObtained/3;
      float percentage=(totalObtained/totalMarks)*100;
      if (percentage>=80) {
        System.out.println("Level 4, above agency-normalized standards"+" and averrage marks are "+average );
      } else if (percentage>=70 && percentage<=79) {
        System.out.println("Level 3, at agency-normalized standards"+" and averrage marks are "+average );
      }else if (percentage>=70&& percentage<=69) {
        System.out.println("Level 2, below, but approaching agency-normalized standards"+" and averrage marks are "+average );
      }else if (percentage>=50&& percentage<=59) {
        System.out.println("Level 1, well below agency-normalized standards"+" and averrage marks are "+average );
      }else if (percentage>=40&& percentage<=49) {
        System.out.println("Level 1, to below  agency-normalized standards"+" and averrage marks are "+average );
      }
      else{
        System.out.println("Remedial Standards"+" and averrage marks are "+average );
      }
    }
    
}
