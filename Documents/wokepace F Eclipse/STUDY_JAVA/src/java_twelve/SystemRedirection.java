package java_twelve;

import java.io.*;



public class SystemRedirection {
	public static void main(String args[]) throws Exception{
//		输出重定向
		System.setOut(new PrintStream(new FileOutputStream("/Users/wuyufan/Downloads" + File.separator + "test.txt")));
		System.out.print("sdfsdf");		//输出时，不再像屏幕上输出
		System.out.println("s fd,sf d");
	}
}
//此代码，完成了System.out重定向
//通过此操作完成错误的重定向，but System.out是希望用户看得到的信息，一旦有错误，最好保存起来