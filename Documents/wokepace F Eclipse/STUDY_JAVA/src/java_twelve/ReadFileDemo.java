package java_twelve;

import java.io.File;
import java.io.RandomAccessFile;
public class ReadFileDemo {
	public static void main(String args[]) throws Exception{
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		RandomAccessFile rdf = null;
		rdf = new RandomAccessFile(f,"r");
		String name = null;
		int age = 0;
		byte b[] = new byte[8];
		rdf.skipBytes(12);
		for(int i=0;i<b.length;i++){
			b[i] = rdf.readByte();
		}
		name = new String(b);
		name = new String(b) ;	// 将读取出来的byte数组变为字符串
		age = rdf.readInt() ;	// 读取数字
		System.out.println("第二个人的信息 --> 姓名：" + name + "；年龄：" + age) ;
		rdf.seek(0);
		for(int i=0;i<b.length;i++){
			b[i] = rdf.readByte();
		}
		name = new String(b) ;	// 将读取出来的byte数组变为字符串
		age = rdf.readInt() ;	// 读取数字
		System.out.println("第一个人的信息 --> 姓名：" + name + "；年龄：" + age) ;
		rdf.skipBytes(12) ;	// 空出第二个人的信息
		for(int i=0;i<b.length;i++){
			b[i] = rdf.readByte() ;	// 读取一个字节
		}
		name = new String(b) ;	// 将读取出来的byte数组变为字符串
		age = rdf.readInt() ;	// 读取数字
		System.out.println("第三个人的信息 --> 姓名：" + name + "；年龄：" + age) ;
		rdf.close() ;	//close
	}
}
