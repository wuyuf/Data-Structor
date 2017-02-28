package java_twelve;

import java.io.*;
public class ListFileAllDemo {
	public static void main(String args[]){
		File f = new File("/Users/wuyufan/Downloads" + File.separator);
		print(f);
	}
	public static void print(File file){
		if(file!=null){
			File fl[] = file.listFiles();
			if(fl!=null){
				for(int i=0;i<fl.length;i++){
					print(fl[i]);
				}
			}
		}else{
			System.out.println(file);
		}
	}
}
