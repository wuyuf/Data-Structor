package java_twelve;

import java.io.OutputStream;
import java.io.IOException;

public class SystemOut {
	public static void main(String args[]){
		OutputStream out = System.out;
		try {
			out.write("Hsd f, off, len".getBytes());	// 向屏幕上输出
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
