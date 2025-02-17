import java.util.*;
public class ArrayHashSetTreeSetCompare{
	public static int  linearSearch(int arr[], int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String arg[]){
		int sizes[]={1000,10000,1000000};
		for(int s:sizes){
			int arr[]=new int[s];
			TreeSet<Integer> treeSet=new TreeSet<>();
			HashSet<Integer> hashSet=new HashSet<>();
			
			Random r=new Random();
			for(int i=0;i<s;i++){
				arr[i]=r.nextInt(s*10);
				hashSet.add(arr[i]);
				treeSet.add(arr[i]);
			}
			int target=arr[s-1];
			long startTime=System.nanoTime();
			linearSearch(arr, target);
			long endTime=System.nanoTime();
			long arrayTime=endTime-startTime;
			
			startTime=System.nanoTime();
			hashSet.contains(target);
			endTime=System.nanoTime();
			long hashTime=endTime-startTime;
			
			startTime=System.nanoTime();
			treeSet.contains(target);
			endTime=System.nanoTime();
			long TreeTime=endTime-startTime;
			
			System.out.println("Size:"+s);
			System.out.println("Linear Search Time:"+arrayTime);
			System.out.println("HashSet time:"+hashTime);
			System.out.println("TreeSet time:"+TreeTime+"\n");
			
		}
	}
}