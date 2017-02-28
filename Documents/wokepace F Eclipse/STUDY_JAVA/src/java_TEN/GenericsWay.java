package java_TEN;


class Demo{
	public <T> T fun(T t){			//可以接收任意类型的数据
		return t;
	}
}
public class GenericsWay {
	public static void main(String args){
		Demo d = new Demo();
		String str = d.fun("sdf");
		int i = d.fun(20);		//传递数字，自动装箱
		System.out.println(str);
		System.out.println(i);

	}
}
