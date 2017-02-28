package java_eleven;

import java.util.Timer;

public class TestTask {
	public static void main(String args[]){
		Timer t = new Timer();
		MyTask mytask = new MyTask();
		t.schedule(mytask, 1000,3000);
	}
}
