public class RecursiveVSIterative{
	public static int fibbonaciRecursive(int n){
		if(n<=1){
			return n;
		}
		return fibbonaciRecursive(n-1)+fibbonaciRecursive(n-2);
	}
	
	public static int fibbonaciIterative(int n){
		int a=0,b=1,sum;
		
		for(int i=2;i<=n;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return b;
		
	}
	public static void main(String args[]){
		int sizes[]={10,30,40};
		
		for(int s:sizes){
			
			long startTime=System.nanoTime();
			int r=fibbonaciRecursive(s);
			long endtime=System.nanoTime();
			long recursiveTime=endtime-startTime;
			System.out.println("Size:"+s);
			System.out.println("Recursive:"+recursiveTime/1000000.0+" ms");
			
			startTime=System.nanoTime();
			int w=fibbonaciIterative(s);
			endtime=System.nanoTime();
			long iterativeTime=endtime-startTime;
			System.out.println("Iterative:"+iterativeTime/1000000.0+" ms");
		}
	}

}