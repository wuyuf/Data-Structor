package JAVA_NINE;

class SecondDemo implements Runnable{
	private String name ;
	private int time ;
	public SecondDemo(String name,int time){
		this.name =   name ;	// 设置线程名称
		this.time = time ;	// 设置休眠时间
	}
	public void run(){
		try{
			Thread.sleep(this.time) ;	// 休眠指定的时间
		}catch(InterruptedException e){
			e.printStackTrace() ;
		}
		System.out.println(Thread.currentThread() + "线程，休眠" + this.time + "毫秒") ;
	}
};
public class SecondExample{
	public static void main(String args[]){
		SecondDemo mt1 = new SecondDemo("线程A",10000) ;	// 定义线程对象，指定休眠时间
		SecondDemo mt2 = new SecondDemo("线程B",20000) ;	// 定义线程对象，指定休眠时间
		SecondDemo mt3 = new SecondDemo("线程C",30000) ;	// 定义线程对象，指定休眠时间
		new Thread(mt1).start() ;	// 启动线程
		new Thread(mt2).start() ;	// 启动线程
		new Thread(mt3).start() ;	// 启动线程
	}
};