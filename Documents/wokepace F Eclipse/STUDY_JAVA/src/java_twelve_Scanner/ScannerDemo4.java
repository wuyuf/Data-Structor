package java_twelve_Scanner;


import java.util.*;
import java.text.*;
public class ScannerDemo4 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);	//从键盘接收数据
		String str = null;
		Date date = null;
		System.out.println("input date (yyyy-MM-dd");
		if(scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){			//判断
			str=scan.next("^\\d{4}-\\d{2}-\\d{2}$");		//接收
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			} catch (ParseException e) {
				e.printStackTrace();		
		}
	}else{
		System.out.println("输入日期格式错误");
	    }
		System.out.println(date);
	}
}
