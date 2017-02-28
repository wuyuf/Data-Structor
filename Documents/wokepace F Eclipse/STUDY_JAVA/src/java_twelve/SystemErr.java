package java_twelve;

import java.io.*;


public class SystemErr {
	public static void main(String args[]){
		String str = "hello";
		try{
		System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
