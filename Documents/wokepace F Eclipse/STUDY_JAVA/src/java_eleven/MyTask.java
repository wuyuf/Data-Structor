package java_eleven;

import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;
class MyTask extends TimerTask{
	public void run()	{
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");	   //定义格式化规则
		System.out.println("当前系统时间为：" + sdf.format(new Date())) ;	//将日期转换成格式化形式
		
	}
}

