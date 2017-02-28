package java_seven;

class Math{
	public int div(int i,int j) throws Exception{
		int temp = i/j;
		return temp;
	}
}
public class ThrowsDemo {
	public static void main(String args[]){
		Math m = new Math();
		try {
			System.out.println("除法操作" + m.div(20, 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			//打印异常
		}
	}
}


//主方法中也是用throws方法，即可不用添加异常 处理
/*
public class ThrowsDemo{
	public static void main(String args[])  throws Exception{
		Math m - new Math();
		System.out.println("除法操作" + m.div(10, 2));
	}
}
*/