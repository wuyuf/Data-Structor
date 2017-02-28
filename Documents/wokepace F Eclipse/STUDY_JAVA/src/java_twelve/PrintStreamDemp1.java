package java_twelve;


import java.io.*;

public class PrintStreamDemp1 {
	public static void main(String args[]) throws Exception{
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("/Users/wuyufan/Downloads" + File.separator + "test.txt")));
		ps.print("sdf");
		ps.println("world!!!") ;
		ps.print("1 + 1 = " + 2) ;
		ps.close() ;
	}
}
