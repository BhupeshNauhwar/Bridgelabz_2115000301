class Calculation {
    public int getRandomHeight() {
       return 150 + (int)(Math.random() * 101);
    }
 
    public int findSum(int[] heights) {
       int sum = 0;
       for (int i = 0; i < heights.length; i++) {
          sum += heights[i];
       }
       return sum;
    }
 
    public double findMean(int[] heights) {
       int sum = findSum(heights);
       return (double) sum / heights.length;
    }
 
    public int findShortest(int[] heights) {
       int shortest = heights[0];
       for (int i = 1; i < heights.length; i++) {
          if (heights[i] < shortest) {
             shortest = heights[i];
          }
       }
       return shortest;
    }
 
    public int findTallest(int[] heights) {
       int tallest = heights[0];
       for (int i = 1; i < heights.length; i++) {
          if (heights[i] > tallest) {
             tallest = heights[i];
          }
       }
       return tallest;
    }
 
   
 }
 public class RandomNumbersArray {
 
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        int[] heights = new int[11];
  
        for (int i = 0; i < heights.length; i++) {
           heights[i] = cal.getRandomHeight();
        }
  
        
        
  
        System.out.println("Sum of all heights: " +cal.findSum(heights));
        System.out.println("Mean height: " + cal.findMean(heights));
        System.out.println("Shortest height: " + cal.findShortest(heights));
        System.out.println("Tallest height: " + cal.findTallest(heights));
     }
 }
 