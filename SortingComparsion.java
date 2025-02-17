import java.util.*;
public class SortingComparsion{
	
	public static void bubbleSort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void mergeSort(int arr[]) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
	
	public static int[] generateDataSet(int size){
		int arr[]=new int[size];
		Random r=new Random();
		
		for(int i=0;i<size;i++){
			arr[i]=r.nextInt(size*10);
		}
		
		return arr;
		
	}
	
	public static void main(String ags[]){
		Random r=new Random();
		
		int sizes[]={1000,10000,100000};
		
		for(int s:sizes){
			int data[]=generateDataSet(s);
			
			int bubbleSortArray[]=Arrays.copyOf(data, data.length);
			long startTime=System.nanoTime();
			bubbleSort(bubbleSortArray);
			long endTime=System.nanoTime();
			long bubbletime=endTime-startTime;
			 
			int mergeSortArray[]=Arrays.copyOf(data, data.length);
			startTime=System.nanoTime();
			mergeSort(mergeSortArray);
			endTime=System.nanoTime();
			long mergeSortTime=endTime-startTime;
			
			int quickSortArray[]=Arrays.copyOf(data, data.length);
			startTime=System.nanoTime();
			quickSort(quickSortArray,0,quickSortArray.length-1);
			endTime=System.nanoTime();
			long quickSortTime=endTime-startTime;
			
			
			System.out.println("Size:"+s);
			System.out.println("Bubble Sort time:"+bubbletime/1000000.0+" ms");
			System.out.println("Mergese Sort time:"+mergeSortTime/1000000.0+" ms");
			System.out.println("Quick Sort time:"+quickSortTime/1000000.0+" ms");
			
		
		}
		
		
	}

}