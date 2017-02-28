package java_eleven;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale ;

public class PrinteTime {
	public static void main(String args){
		DateFormat df1 = null;
		DateFormat df2 = null;
		DateFormat df3 = null;

		df1 = DateFormat.getDateInstance();	//得到日期的Dateformat对象
		df2 = DateFormat.getDateTimeInstance();		//得到日期时间的DateFormat对象
		df3 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN")) ;	// 得到日期的DateFormat对象
		System.out.println("DATE:" + df1.format(new Date()));
	}
}