package java_twelve_ZipDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;



public class ZipFileDemo2 {
	public static void main(String args[]) throws Exception{	// 所有异常抛出
		File file = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt.zip");
		File outputFile = new File("/Users/wuyufan/Downloads" + File.separator + "test1.txt");
		ZipFile zipFile  = new ZipFile(file);
		ZipEntry entry = zipFile.getEntry("test.txt");
		OutputStream out = new FileOutputStream(outputFile) ; // 实例化输出流
		InputStream input = zipFile.getInputStream(entry) ;	// 得到一个压缩实体的输入流
		int temp = 0 ;
		while((temp=input.read())!=-1){
			out.write(temp) ;
		}
		input.close() ;	// 关闭输入流
		out.close() ;	// 关闭输出流
	
	
	}
}
