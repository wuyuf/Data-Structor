package java_twelve;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputStreamSecond {
	public static void main(String args[]) throws Exception{	// 异常抛出，不处理
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		InputStream input = null;
		input = new FileInputStream(f);
		byte b[] = new byte[1024];	
		int len = input.read(b);
		input.close();
		System.out.println("读入数据的长度：" + len) ;
		System.out.println("内容为：" + new String(b,0,len)) ;	// 把byte数组变为字符串输出
	}
}


