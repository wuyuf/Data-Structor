package java_twelve;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputStreamFInally {
	public static void main(String args[]) throws Exception{
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		InputStream input = null;
		input = new FileInputStream(f);
		byte b[] = new byte[1024];
		int len = 0;
		int temp = 0;
		while((temp=input.read())!=-1){		// 表示还有内容，文件没有读完

			b[len] = (byte)temp;
			len++;
		}
		input.close();
		System.out.println("内容为：" + new String(b,0,len));
	}
}
