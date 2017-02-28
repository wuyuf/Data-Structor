package java_twelve;


import java.io.*;
public class SystemErrRedirct {
	public static void main(String args[]){
		ByteArrayOutputStream bos = null;	//声明内存输出流
		bos = new ByteArrayOutputStream();		//	实例化
			System.setErr(new PrintStream(bos));	//输出重定向
			System.err.print("sdf sfd");
		System.err.println("sdf ") ;			// 向内存中输出，到这一步运行时是将内容输入在内存中
		System.out.println(bos) ;	// 输出内存中的数据  
	}
}
