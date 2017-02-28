package java_twelve;

import java.io.*;

public class FileSecondIO {
	public static void main(String args[]){
		File f = new File("/Users/wuyufan/Desktop/[www.java1234.com]MLDN李兴华《JAVA开发实战经典》随书视频/031201_【第12章：JAVA.IO】_File类/"+File.pathSeparator+"aaa");
		f.delete();		//删除文件
		f.mkdir();		//创建一个文件夹
	}
}
