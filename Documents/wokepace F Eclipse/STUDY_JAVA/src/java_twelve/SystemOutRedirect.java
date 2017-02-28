package java_twelve;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SystemOutRedirect {
	public static void main(String args[]){
		String str = "Hello";
		try{
		System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			try{
				System.setOut(new PrintStream(new FileOutputStream("/Users/wuyufan/Downloads" + File.separator + "test.txt")));
			}catch(Exception e1){
				
			}
			System.out.println(e);
		}
	}
}
