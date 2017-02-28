package java_twelve;


import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String args[]){
		File f = new File("/Users/wuyufan/Desktop/[www.java1234.com]MLDN李兴华《JAVA开发实战经典》随书视频/031201_【第12章：JAVA.IO】_File类/"+File.pathSeparator+"aaa.txt");
		try{
			f.createNewFile() ;		// 创建文件，根据给定的路径创建
		}catch(IOException e){
			e.printStackTrace() ;	// 输出异常信息
		}
	}
}
 