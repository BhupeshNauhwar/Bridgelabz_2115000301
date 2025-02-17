import java.io.*;
import java.nio.file.*;
public class FileReading{
	public static void readFileReader(String filePath) throws IOException{
		FileReader f=new FileReader(filePath);
		
		char[] buffer=new char[1024];
		int readChars;
		
		while((readChars=f.read(buffer))!=-1){
			
		}
		f.close();
	}
	public static void readInputStreamReader(String filePath) throws IOException{
		InputStreamReader i= new InputStreamReader(new FileInputStream(filePath));
		
		char buffer[]=new char[1024];
		int readChars;
		while((readChars=i.read(buffer))!=-1){
		
		}
		i.close();
		
	}
	public static void main(String arg[]){
		try {
		String filePath="large.txt";
		
		long startTime=System.nanoTime();
		readFileReader(filePath);
		long endTime=System.nanoTime();
		long fileReaderTime=endTime-startTime;
		
		startTime=System.nanoTime();
		readInputStreamReader(filePath);
		endTime=System.nanoTime();
		long inputStreamReaderTime=endTime-startTime;
		
		System.out.println("FileReader time:"+fileReaderTime/1000000.0+" ms");
		
		System.out.println("InputStreamReader:"+inputStreamReaderTime/1000000.0+" ms");
		
	}catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
	}
}