package java_eleven;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo3 {
	public static void main(String args[]){
		String str =  "1983-07-27" ;		// 指定好一个日期格式的字符串、
		String  pat = "\\d{4}-\\d{2}-\\d{2}";	//指定好正则表达式
		Pattern p = Pattern.compile(pat);
		Matcher m= p.matcher(str); 
		if(m.matches()){
			System.out.println("correct!");
			
		}else{
			System.out.println("日期格式不合法！") ;

		}
	}
}
