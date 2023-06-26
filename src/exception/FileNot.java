package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNot {
	public static void main(String[] args) throws IOException{
		try {
		File f=new File("C:\\Users\\Jothi lakshmi\\OneDrive\\Desktop\\Dem.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}}
		catch(FileNotFoundException ab) {
			System.out.println(ab);
			System.out.println("file not available");
		}
		}
		
		}
