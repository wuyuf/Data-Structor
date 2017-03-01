package java_twelve_Scanner;

import java.util.*;
import java.io.*;
import java.text.*;
public class ScannerDemo6 {
	public static void main(String args[]){
	File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");		//指定操作文件
	Scanner scan=null;
	try{
	scan=new Scanner(f);
	}catch(Exception e){}
	StringBuffer str= new StringBuffer();	
	while(scan.hasNext()){
		str.append(scan.next()).append('\n');
		}
	System.out.println("文件内容为：" + str) ;
	}
}
