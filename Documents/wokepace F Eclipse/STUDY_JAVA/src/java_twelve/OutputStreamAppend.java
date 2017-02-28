package java_twelve;


import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
public class OutputStreamAppend {
	public static void main(String args[]) throws Exception{
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		OutputStream out =null;
		out = new FileOutputStream(f,true);		// 此处表示在文件末尾追加内容
		String str = "\r\nHello World";
		byte b[] = str.getBytes() ;			// 只能输出byte数组，所以将字符串变为byte数组
		for(int i=0;i<b.length;i++){
			out.write(b[i]);
		}
		out.close();
	}
}
