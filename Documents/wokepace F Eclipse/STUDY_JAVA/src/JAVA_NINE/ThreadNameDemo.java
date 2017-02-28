package JAVA_NINE;

class OurThread implements Runnable{	// 实现Runnable接口

	public void run() {	// 覆写run()方法
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			System.out.print(Thread.currentThread().getName()
					+ "运行，i= " + i);   //取得当前线程名字
		}
	}
	
}
public class ThreadNameDemo {
	public static void main(String args[]){
		OurThread ot = new OurThread();		//实例化Runnable子类对象
		new Thread(ot).start();		// 系统自动设置线程名称
		new Thread(ot).start();
		new Thread(ot).start();
		new Thread(ot,"线程-A").start();		//Through myself hands to set the ThreadName
		new Thread(ot,"线程-B").start();

	}
}
