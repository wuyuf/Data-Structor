package java_twelve;

import java.io.File;
import java.io.IOException;

public class CreatDeleteFile {
	public static void main(String args[]){
		File f = new File("/Users/wuyufan/Desktop/[www.java1234.com]MLDN李兴华《JAVA开发实战经典》随书视频/031201_【第12章：JAVA.IO】_File类/031201_【第12章：JAVA IO】_File类" + File.separator + "test.txt");
		if(f.exists()){
			f.delete();
		}else{
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();	//print the exception information
			}
		}
	}
}
