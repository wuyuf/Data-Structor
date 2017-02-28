package JAVA_NINE;

class OursThread implements Runnable{	// 实现Runnable接口

	public void run() {	// 覆写run()方法
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			System.out.print(Thread.currentThread().getName()
					+ "运行，i= " + i);   //取得当前线程名字
		}
	}
	
}
public class CurrentNameDemo {
	public static void main(String args[]){
		OurThread ot = new OurThread();		//实例化Runnable子类对象
		new Thread(ot,"线程").start();		//启动线程
		ot.run();							//调用run方法
	}
}
