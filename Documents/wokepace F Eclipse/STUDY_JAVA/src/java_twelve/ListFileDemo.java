package java_twelve;


import java.io.File;
import java.io.IOException;

public class ListFileDemo {
	public static void main(String args[]){
		File f = new File("/Users/wuyufan/Downloads" + File.separator);
		String str[] = f.list();			//	list these contents from have regulation's contents
		for(int i = 0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
