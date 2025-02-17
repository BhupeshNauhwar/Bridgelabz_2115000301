import java.util.*;
public class SearchComparsion{
			
		public static int linearSearch(int arr[], int target){
			for(int i=0;i<arr.length;i++){
				if(arr[i]==target){
					return i;
				}
			}
			return -1;
		}
		
		public static int BinarySearch(int arr[], int target){
			int left=0, right= arr.length-1;
			
			while(left<=right){
				int mid= left+(right-left)/2;
				if(arr[mid]==target){
					return mid;
				}
				else if(arr[mid]<target){
					left=mid+1;
				}
				else{
					right=mid-1;
				}
			}
			return -1;
		}
		
		public static int[] generateDataset(int size){
			Random r=new Random();
			int arr[]=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=r.nextInt(size*10);
			}
			return arr;
		}
		
		public static void main(String args[]){
			int sizes[]={1000,10000,1000000};
			Random r=new Random();
			
			for(int s:sizes){
				int data[]=generateDataset(s);
				int target=data[r.nextInt(s)];
			
			
				long startTime=System.nanoTime();
				linearSearch(data,target);
				long endTime=System.nanoTime();
				long linearTime=endTime-startTime;
			
				Arrays.sort(data);
				 startTime=System.nanoTime();
				BinarySearch(data,target);
				 endTime=System.nanoTime();
				long binaryTime=endTime-startTime;
			
				System.out.println("Size of array:"+s);
				System.out.println("Linear Search time:"+linearTime/100000.0+" ms");
				
				System.out.println("Binary Search time:"+binaryTime /100000.0+" ms");
			}
		}
		
	
}