package java_twelve;

import java.io.*;

class Send implements Runnable{
	private PipedOutputStream pos = null;
	public Send(){
		this.pos = new PipedOutputStream();
	}
	public void run(){
		String str = "HELLO WORLD!!";
		try {
			this.pos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.pos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public PipedOutputStream getPos() {
			return this.pos;
	}
}

class Receive implements Runnable{
	private PipedInputStream pis = null;
	public Receive(){
		this.pis = new PipedInputStream();
	}
	public void run(){
		byte b[] = new byte[1024];
		int len = 0;
		try {
			len = this.pis.read(b);	//读取内容
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the contents is:" + new String(b,0,len));
	}
	public PipedInputStream getPis(){
		return this.pis;
	}
}
public class PipedDemo {
	public static void main(String args[]) throws IOException{
		Send s = new Send();
		Receive r  = new Receive();
		s.getPos().connect(r.getPis());		//连接管道
		new Thread(s).start();
		new Thread(r).start();
		
	}
}














