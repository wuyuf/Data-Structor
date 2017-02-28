package java_eleven;

import java.util.*;
class DateTime{
	private Calendar calendar =null;
	public DateTime(){
		this.calendar = new GregorianCalendar();
	}
	public String getDate(){
		//考虑到程序要频繁修费字符串，所以使用StringBuffer提升性能
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("_");
		buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1,2)).append(" ");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)).append(":");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append(":") ;	// 取得时
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append(":") ;
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append(".") ;
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)) ;
		return buf.toString();
	}
	public String getDateComplete(){		// 得到的是一个日期：格式为：yyyy年MM月dd日 HH时mm分ss秒SSS毫秒
		// 考虑到程序要频繁修改字符串，所以使用StringBuffer提升性能
		StringBuffer buf = new StringBuffer() ;
		buf.append(calendar.get(Calendar.YEAR)).append("年") ;	// 增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2)).append("月") ;	// 增加月
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)).append("日") ;	// 取得日
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append("时") ;	// 取得时
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append("分") ;		// 取得分
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append("秒") ;		// 取得秒
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)).append("毫秒") ;	 // 取得毫秒
		return buf.toString() ;
	}
	public String getTimeStamp(){		// 得到的是一个时间戳
		// 考虑到程序要频繁修改字符串，所以使用StringBuffer提升性能
		StringBuffer buf = new StringBuffer() ;
		buf.append(calendar.get(Calendar.YEAR)).append("年") ;	// 增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2));	// 增加月
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2));	// 取得日
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)) ;	// 取得时
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)) ;		// 取得分
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2));		// 取得秒
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3));	 // 取得毫秒
		return buf.toString() ;
	}
	
	private String addZero(int num,int len){
		StringBuffer s = new StringBuffer();
		s.append(num);
		while(s.length()<len){
			s.insert(0, "0");
		}
		return s.toString();
	}
}
public class CallenderExampleDemo {
	public static void main(String args[]){
		DateTime dt = new DateTime();
		System.out.println("系统日期：" + dt.getDate());
		System.out.println("中文日期："+dt.getDateComplete()) ;
		System.out.println("时间戳："+dt.getTimeStamp()) ;


	}
}
