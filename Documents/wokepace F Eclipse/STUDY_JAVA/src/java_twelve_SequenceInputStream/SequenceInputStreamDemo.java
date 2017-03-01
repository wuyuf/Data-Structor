package java_twelve_SequenceInputStream;


import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class SequenceInputStreamDemo {
	public static void main(String args[])throws Exception{
		InputStream is1 = null;
		InputStream is2 = null;
		OutputStream os = null;
		SequenceInputStream sis = null;
		is1 = new FileInputStream("/Users/wuyfuan/Downloads" + File.separator + "a.txt");
		is2 = new FileInputStream("/Users/wuyfuan/Downloads" + File.separator + "b.txt");
		os = new FileOutputStream("/Users/wuyfuan/Downloads" + File.separator + "ab.txt");
		sis = new SequenceInputStream(is1,is2);
		int temp = 0;		//接受内容
		while((temp=sis.read())!=-1	){
			os.write(temp);
		}
		sis.close();
		is1.close();
		is2.close();
		os.close();
	}
}
