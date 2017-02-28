package java_twelve;

import java.io.*;

public class SystemInRederict {
	public static void main(String args[])throws Exception{
		System.setIn(new FileInputStream("/Users/wuyufan/Downloads" + File.separator + "test.txt"));
		InputStream input = System.in; 	//从文件中接受数据
		byte b[] = new byte[1024];
		int len = input.read(b);	//接受内容
		System.out.println("sdjfhs" + new String(b,0,len));
		input.close();
	}
}
