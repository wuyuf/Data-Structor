package java_twelve_Scanner;

import java.util.Scanner;

public class ScnnerDemo2 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("please input data: ");
		scan.useDelimiter("\n");
		String str = scan.next();	//接受数据
		System.out.println("input data is : " + str);
	}
}

//输入的数据以字符串形式返回，but Scanner类也可以方便的直接返回整数或者小数


