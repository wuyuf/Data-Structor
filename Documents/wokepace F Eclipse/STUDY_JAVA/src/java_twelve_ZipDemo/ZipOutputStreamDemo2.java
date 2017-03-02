package java_twelve_ZipDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;


public class ZipOutputStreamDemo2 {
	 public static void main(String argsp[])throws Exception{
		 File file = new File("/Users/wuyufan/Downloads" + File.separator + "mldn" );
		 File zipFile = new File("/Users/wuyufan/Downloads" + File.separator + "mldn.zip");
		 InputStream input = null;
		 ZipOutputStream zipOut = null;
		 zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		 zipOut.setComment("sdf");
		 int temp = 0;
		 if(file.isDirectory()){
			 File lists[] = file.listFiles();
			 for(int i=0;i<lists.length;i++){
			 input = new FileInputStream(lists[i]);
			 zipOut.putNextEntry(new ZipEntry(file.getName()
					 +File.separator+lists[i].getName()));
			 while((temp=input.read())!=-1){
				 zipOut.write(temp);
			 	}
			 input.close();
			 }
		 }
		 zipOut.close();
	 }
}
