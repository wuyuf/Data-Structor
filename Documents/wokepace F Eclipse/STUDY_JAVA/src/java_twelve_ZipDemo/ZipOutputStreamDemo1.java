package java_twelve_ZipDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
public class ZipOutputStreamDemo1 {
	public static void main(String args[])throws Exception{
		File file = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		File zipFile = new File("/Users/wuyufan/Downloads" + File.separator + "test.zip");
		InputStream input = new FileInputStream(file);
		ZipOutputStream zipOut = null;
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		zipOut.setComment("wsdfsdfsdf");	//设置注释
		int temp = 0;
		while((temp=input.read())!=-1){	//读取内容
			zipOut.write(temp);		//压缩输出
			
		}
		input.close();
		zipOut.close();
	}
}
