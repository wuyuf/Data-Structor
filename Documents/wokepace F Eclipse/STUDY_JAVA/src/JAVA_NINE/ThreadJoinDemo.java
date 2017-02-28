package JAVA_NINE;


class QuictRun implements Runnable{	// 实现Runnable接口
	public void run(){	// 覆写run()方法
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()
					+ "运行，i = " + i) ;	// 取得当前线程的名字
		}
	}
};




public class ThreadJoinDemo{
	public static void main(String args[]){
		QuictRun mt = new QuictRun() ;	// 实例化Runnable子类对象
		Thread t = new Thread(mt,"线程");// 实例化Thread对象
		t.start();
		for(int i=0;i<50;i++){
			if(i>10){
				try{
					t.join();		//线程强制运行
				}catch(InterruptedException e){}
			}
			System.out.print("Main线程运行 --》"+i);
		}
	}
};
