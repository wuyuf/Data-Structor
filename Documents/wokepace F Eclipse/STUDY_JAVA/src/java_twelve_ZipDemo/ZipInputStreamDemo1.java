package java_twelve_ZipDemo;


import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipInputStream ;
import java.io.FileInputStream ;

public class ZipInputStreamDemo1 {
	public static void main(String args[]) throws Exception{	// 所有异常抛出
	
		File zipFile = new File("/Users/wuyufan/Downloads" + File.separator + "mldn.zip") ;	// 找到压缩文件
		ZipInputStream input = null;	//定义压缩输入流
		input = new ZipInputStream(new FileInputStream(zipFile)) ;	// 实例化ZIpInputStream
		ZipEntry entry = input.getNextEntry();
		System.out.println("" + entry.getName());
		input.close();
	
	}
}
