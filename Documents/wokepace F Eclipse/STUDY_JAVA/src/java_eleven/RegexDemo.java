package java_eleven;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
	public static void main(String args[]){
		// 要求将里面的字符取出，也就是说按照数字 替换为_

		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";	// 指定好正则表达式
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		String newString = m.replaceAll("_");
		System.out.println(newString);
	
	}
}
