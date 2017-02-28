package java_seven;

class Mathing{
	public int div(int i,int j)throws Exception{		// 定义除法操作，如果有异常，则交给被调用处处理
		int temp = 0;
		try{
			temp = i/j;
		}catch(Exception e){
			System.out.println("计算开始");
		}finally{
			System.out.println("计算结束");
		}
		return temp;
	}
}
public class ThrowDemo {
    public static void main(String args[]){
    	Mathing m = new Mathing();
    	try {
			System.out.println("" + m.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
