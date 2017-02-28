package java_twelve;

import java.io.*;
public class ExecDemo1 {
	public static void main(String argsp[]) throws Exception{
		int i = 0;
		int j=0;
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.println("请输入第一个数字");
		str = buf.readLine();	//接收数据
		i=Integer.parseInt(str);	//将字符串变为整数
		System.out.print("请输入第二个数字：");
		str  = buf.readLine();
		j=Integer.parseInt(str);
		System.out.println(i + " + " + j + " = " + (i + j)) ;

	}
}
