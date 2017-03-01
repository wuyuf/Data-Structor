package java_twelve_Scanner;

import java.util.*;
public class ScannerDemo3 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i =0;
		float f = 0.0f;
		System.out.print("please input integer :  ");	
		if(scan.hasNextInt()){							// 判断输入的是否是整数
			i=scan.nextInt();							//接收整数
			System.out.println(i);
		}else{
			System.out.println("input err,please input integer again:  ");
		}
		System.out.print("please input float :  ");		
		if(scan.hasNextFloat()){						// 判断输入的是否是小数
			f=scan.nextFloat();							//接受小数
			System.out.print(f);
		}else{
			System.out.println("input err,please input float again:  ");
		}
	}
}
