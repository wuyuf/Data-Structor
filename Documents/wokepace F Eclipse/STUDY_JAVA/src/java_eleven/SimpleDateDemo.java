package java_eleven;


import  java.text.*;
import java.util.*;

public class SimpleDateDemo {
	public static void main(String argsp[]){
		String strDate = "2008-10-19 10:11:30.345" ;
		// 准备第一个模板，从字符串中提取出日期数字
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS" ;
		//准备第二个末班，将提取后的提起数字变为制定的格式
		String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒" ;
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d  = null;
		try{
			d = sdf1.parse(strDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
}
