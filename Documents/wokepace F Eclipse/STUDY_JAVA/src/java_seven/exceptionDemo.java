package java_seven;

public class exceptionDemo {
	public static void main(String args[]){
		System.out.print("计算开始");
		int i = 10;
		int j = 2;
		try{
			String str1 = args[0];//接收第一个参数
			String str2 = args[1];//接收第二个参数
			i = Integer.parseInt(str1);//降第一个参数由字符串变为整型
			j = Integer.parseInt(str2);//将第二个参数由字符串变为整型
			int temp = i/j;
			System.out.println("两个数字相除的结果" + temp);
		}catch(Exception e){
			System.out.println("其他异常" + e);
		}
		System.out.println("计算结束");
	}
}
