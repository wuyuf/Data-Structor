package java_twelve_Scanner;

import java.util.*;
import java.io.*;
import java.text.*;
public class ScannerDemo5 {
	public static void main(String args[]){
		File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");		//指定操作文件
		Scanner scan=null;
		try{
		scan=new Scanner(f);
		}catch(Exception e){}
		String str = null;
		if(scan.hasNext()){
			str=scan.next();
			
		}
		System.out.println(str);
	}
}
//此代码所读取出的文件内容一旦遇到空格则不继续读取，所以需要改进
