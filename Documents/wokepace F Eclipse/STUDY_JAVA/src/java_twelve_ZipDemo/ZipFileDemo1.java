package java_twelve_ZipDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class ZipFileDemo1 {
	public static void main(String args[])throws Exception{
		File file = new File("/Users/wuyufan/Downloads" + File.separator + "mldn.zip");
		ZipFile zipFile = new ZipFile(file);
		System.out.println("the compress file's name is :  "  + zipFile.getName()) ;	// 得到压缩文件的名称
	}
}
//以上的操作中有个问题：   必须知道压缩文件中的每一个压缩实体的名称才可以进行解压缩操作，所以需要进行代码优化