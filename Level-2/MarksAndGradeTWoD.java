import java.util.Scanner;
public class MarksAndGradeTWoD {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int size = sc.nextInt();

        double marks[][] = new double[size][3];
        double results[][] = new double[size][2];

        for (int i = 0; i < size; i++) {
            

            while (true) {
                System.out.println("Enter Physics Marks for student " + (i + 1));
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0) {
                    System.out.println("Enter positive value for Physics Marks");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("Enter Chemistry Marks for student " + (i + 1));
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0) {
                    System.out.println("Enter positive value for Chemistry Marks");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("Enter Maths Marks for student " + (i + 1));
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0) {
                    System.out.println("Enter positive value for Maths Marks");
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            double obtaineds = marks[i][0] + marks[i][1] + marks[i][2];
            results[i][0] =obtaineds / 3;
            results[i][1] = (obtaineds / 300) * 100;

           
            if (results[i][1] >= 80) {
                System.out.println("Level 4, above agency-normalized standards, Average Marks: " + results[i][0]);
            } else if (results[i][1] >= 70 && results[i][1] < 80) {
                System.out.println("Level 3, at agency-normalized standards, Average Marks: " + results[i][0]);
            } else if (results[i][1] >= 60 && results[i][1] < 70) {
                System.out.println("Level 2, below, but approaching agency-normalized standards, Average Marks: " + results[i][0]);
            } else if (results[i][1] >= 50 && results[i][1] < 60) {
                System.out.println("Level 1, well below agency-normalized standards, Average Marks: " + results[i][0]);
            } else if (results[i][1] >= 40 && results[i][1] < 50) {
                System.out.println("Level 1, to below agency-normalized standards, Average Marks: " + results[i][0]);
            } else {
                System.out.println("Remedial Standards, Average Marks: " + results[i][0]);
            }
           
        }
    }
}


