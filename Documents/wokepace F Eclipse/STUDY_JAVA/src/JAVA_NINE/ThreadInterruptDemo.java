package JAVA_NINE;

class InterruptThread implements Runnable{
	public void run(){
		System.out.println("1.进入run方法");
		try{
			Thread.sleep(10000);		//线程休眠10秒
			System.out.println("2、已经完成了休眠") ;
			}catch(InterruptedException e){
				System.out.println("3、休眠被终止") ;
				return ; // 返回调用处
		}
		System.out.println("4、run()方法正常结束") ;
	}
}
public class ThreadInterruptDemo {
	public static void main(String args[]){
		Thread t = new Thread(new InterruptThread(),"线程");		//实例化Thread对象
		t.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println("3、休眠被终止") ;
		}
		t.interrupt();
	}
}
