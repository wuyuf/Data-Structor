package java_twelve;

import java.io.File;
import java.io.RandomAccessFile; 

public class WriterFileFirstDemo {
	public static void main(String args[]) throws Exception{
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		RandomAccessFile rdf = null;
		rdf = new RandomAccessFile(f,"rw");
		String name = null;
		int age = 0;
		name = "sdsf";
		age = 30;
		rdf.writeBytes(name);
		rdf.writeInt(age);
		name = "lisi    " ;			// 字符串长度为8
		age = 31 ;					// 数字的长度为4
		rdf.writeBytes(name) ;		// 将姓名写入文件之中
		rdf.writeInt(age) ;			// 将年龄写入文件之中
		name = "wangwu  " ;			// 字符串长度为8
		age = 32 ;					// 数字的长度为4
		rdf.writeBytes(name) ;		// 将姓名写入文件之中
		rdf.writeInt(age) ;		
		rdf.close();	//关闭文件
	}
}
