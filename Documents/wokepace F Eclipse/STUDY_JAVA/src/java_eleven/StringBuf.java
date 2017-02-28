package java_eleven;

public class StringBuf {
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer();
		buf.append("dsf");
		fun(buf);
		System.out.println(buf);
	}
	public static void fun(StringBuffer s){
		s.append("sdf").append("sffgd");
	}
}
