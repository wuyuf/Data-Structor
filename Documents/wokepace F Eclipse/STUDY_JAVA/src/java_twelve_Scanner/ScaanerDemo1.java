package java_twelve_Scanner;

import java.util.*;
public class ScaanerDemo1 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("please input data: ");
		String str = scan.next();	//接受数据
		System.out.println("input data is : " + str);
	}
}

//比直接使用BufferedReader更加方便,but 输入时候默认分隔符是空格，所以要改进