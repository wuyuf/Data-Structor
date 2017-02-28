package java_eleven;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo4 {
	public static void main(String args[]){
		// 要求将里面的字符取出，也就是说按照数字拆分

		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";	// 指定好正则表达式
		Pattern p = Pattern.compile(pat);
		String s[] = p.split(str);	// 执行拆分操作
		
		for(int x = 0;x<s.length;x++){
			System.out.print(s[x] + "\t") ;

		}
	}
}
