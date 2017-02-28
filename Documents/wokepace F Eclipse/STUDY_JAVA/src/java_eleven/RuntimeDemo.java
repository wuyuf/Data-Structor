package java_eleven;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String args[]){
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("sdfsfd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
