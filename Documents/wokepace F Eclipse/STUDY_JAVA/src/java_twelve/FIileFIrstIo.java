package java_twelve;

import java.io.File;
import java.io.IOException;

public class FIileFIrstIo {
	public static void main(String args[]) throws IOException{
		File f = new File("/Users/wuyufan/Desktop/[www.java1234.com]MLDN李兴华《JAVA开发实战经典》随书视频/031201_【第12章：JAVA.IO】_File类/031201_【第12章：JAVA IO】_File类//test.txt");
		f.createNewFile();	// 创建文件，根据给定的路径创建
	}
}
