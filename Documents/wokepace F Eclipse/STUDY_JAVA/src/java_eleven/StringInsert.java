package java_eleven;

public class StringInsert {
		public static void main(String args[]){
			StringBuffer buf = new StringBuffer();
			buf.append("dsf");
			buf.insert(0, "sdf");		//制指定位置插入字符串
		    buf.insert(buf.length(), "dsf");
			System.out.println(buf);

		}
}
