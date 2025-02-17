import java.lang.*;
public class StringConcatenation{
	public static String StringConcat(int n){
		String r="";
		for(int i=0;i<n;i++){
			r+="a";
		}
		return r;
	}
	public static String StringBuilderConcat(int n){
		StringBuilder s=new StringBuilder();
		
		for(int i=0;i<n;i++){
			s.append("a");
		}
		return s.toString();
	}
	public static String StringBufferConcat(int n){
		StringBuffer s=new StringBuffer();
		
		for(int i=0;i<n;i++){
			s.append("a");
		}
		return s.toString();
	}
	
	public static void main(String arg[]){
		int sizes[]={1000,10000,100000};
		
		for(int s:sizes){
		
			long startTime=System.nanoTime();
			String result = StringConcat(s);
			long endTime=System.nanoTime();
			long StringTime=endTime-startTime;
			
			startTime=System.nanoTime();
			String resultBuilder = StringBuilderConcat(s);
			endTime=System.nanoTime();
			long Buildertime=endTime-startTime;
			
			startTime=System.nanoTime();
			String resultBuffer = StringBufferConcat(s);
			long BufferTime=endTime-startTime;
			
			System.out.println("Length:"+s);
			System.out.println("String time:"+StringTime/1000000.0+" ms");
			System.out.println("StringBuilder time:"+Buildertime/1000000.0+" ms");
			
			System.out.println("StringBuffer time:"+BufferTime/1000000.0+" ms");
			
		}
	}
	
}