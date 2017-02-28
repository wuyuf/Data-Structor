package java_twelve;

import java.io.*;
public class SysteminDemo {
	public static void main(String args[]) throws Exception{
		InputStream input = System.in;	//从键盘接收数据
		byte b[] = new byte[1024];
		System.out.print("please input contents:");
		int len = input.read(b);	//接收数据
		System.out.println("输入内容为：" + new String(b,0,len));
		input.close();
	}
}
/*此代码问题：1.指定了输入数据的长度，如果输入的代码长度超过了长度范围，则只能输入部分的数据
			2.指定的长度是基数的话，还可能出现中文乱码问题*/