package java_twelve;


import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputStreamFirst {
	public static void main(String args[]) throws Exception {
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		InputStream input = null;
		input = new FileInputStream(f);		// 通过对象多态性，进行实例化
		byte b[] = new byte[1024];	// 所有的内容都读到此数组之中
		int len = input.read(b);
		input.read(b);
		input.close();
		System.out.println("读入数据的长度：" + len) ;

		System.out.println("内容为：" + new String(b));
	}
}
