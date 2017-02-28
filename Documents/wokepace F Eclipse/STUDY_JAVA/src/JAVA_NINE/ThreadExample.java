package JAVA_NINE;


class FirstExample extends Thread{
	private int time;
	public FirstExample(String name,int time){
		super(name);
		this.time = time;
	}
	public void run(){
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread() + "线程，休眠" + this.time + "毫秒");
	}
}
public class ThreadExample {
	public static void main(String args[]){
		FirstExample fe1 = new   FirstExample("线程A",10000);
		FirstExample fe2 = new   FirstExample("线程B",10000);
		FirstExample fe3 = new   FirstExample("线程C",10000);
		fe1.start();
		fe2.start();
		fe3.start();
	}
}
