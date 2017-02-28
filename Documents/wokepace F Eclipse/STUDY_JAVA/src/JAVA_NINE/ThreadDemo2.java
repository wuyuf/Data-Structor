package JAVA_NINE;

class MeThread extends Thread{	// 继承Thread类，作为线程的实现类
	private int ticket = 5 ;		// 表示一共有5张票
	public void run(){	// 覆写run()方法，作为线程 的操作主体
		for(int i=0;i<100;i++){
			if(this.ticket>0){
				System.out.println("卖票：ticket = " + ticket--) ;
			}
		}
	}
};
public class ThreadDemo2{
	public static void main(String args[]){
		MeThread mt1 = new MeThread() ;	 // 实例化对象
		MeThread mt2 = new MeThread() ;	 // 实例化对象
		MeThread mt3 = new MeThread() ;	 // 实例化对象
		mt1.run() ;	// 调用线程主体
		mt2.run() ;	// 调用线程主体
		mt3.run() ;	// 调用线程主体
	}
};


