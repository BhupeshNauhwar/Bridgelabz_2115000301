import java.util.*;

class Calculation{
    public double findAverage(int array[]){
        double avg=0;
        for (int i = 0; i < array.length; i++) {
            avg+=array[i];
        }
        return avg;
    }
    public double findMinimum(int array[]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min=array[i];
            }
        }
        return min;
    }
    public double findMaximum(int array[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
    public int[] FindRanfomArray(){
        Random randomGenerator = new Random();
        
        int array[]=new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]=randomGenerator.nextInt(9000)+1000;
            
        }
        return array;

    }
}
public class RandomNumbers {
    public static void main(String[] args) {
        Calculation cal =new Calculation();
        int array[]=cal.FindRanfomArray();
        System.out.println("Average of 4 random is"+cal.findAverage(array));
        System.out.println("Minimum  "+cal.findMinimum(array));
        System.out.println("Maximu "+cal.findMaximum(array));

    }   
}
