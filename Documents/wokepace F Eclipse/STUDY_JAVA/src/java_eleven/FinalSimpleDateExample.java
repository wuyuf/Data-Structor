package java_eleven;

import java.util.*;
import java.text.*;		//导入SimpleDateormat所在的包
class DateTim{
	private
	 SimpleDateFormat sdf = null;
	public String getDate(){
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS") ;
		return this.sdf.format(new Date());	// 将当前日期进行格式化操作
		
	}
	public String getDateComplete(){
		this.sdf  = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
		return this.sdf.format(new Date());
	}
	public String getTimeStamp(){
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}
}
public class FinalSimpleDateExample {
	public static void main(String args[]){
		DateTim dt = new DateTim();
		System.out.println("系统日期："+dt.getDate()) ;
		System.out.println("中文日期："+dt.getDateComplete()) ;
		System.out.println("时间戳："+dt.getTimeStamp()) ;
	}
}
