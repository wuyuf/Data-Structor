package java_eleven;
import java.text.*;

class FormatDemo{
	public void format1(String pattern,double value){
		DecimalFormat df = null;
		df = new DecimalFormat(pattern);	//实例化对象，传图模板
		String str = df.format(value);	//实例化数字
		System.out.println("使用" + pattern 
				+ "格式化数字" + value +  ":" + str);
	}
}
public class NumberFormatDemo {
	public static void main(String args[]){
		FormatDemo demo = new FormatDemo() ;	// 格式化对象的类
		demo.format1("###,###.###",111222.34567) ;
		demo.format1("000,000.000",11222.34567) ;
		demo.format1("###,###.###￥",111222.34567) ;
		demo.format1("000,000.000￥",11222.34567) ;
		demo.format1("##.###%",0.345678) ;
		demo.format1("00.###%",0.0345678) ;
		demo.format1("###.###\u2030",0.345678) ;
	}
}
