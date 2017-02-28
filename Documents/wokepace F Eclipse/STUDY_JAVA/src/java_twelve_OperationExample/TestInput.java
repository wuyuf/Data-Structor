package java_twelve;

import java.io.*;
import java.util.*;


public class TestInput {
	public static void main(String qrgs[]) {
		InputData input = new InputData();
//		float f = input.getFloat("please input decimal ： "	, "please again input data ！！");
//		System.out.println("decimal ：" +f);
		Date d = input.getDate("Please input Date,the format is (yyyy-MM-dd)","Input format have err,please again input" );
		System.out.println("Date" + d);
	}
}
