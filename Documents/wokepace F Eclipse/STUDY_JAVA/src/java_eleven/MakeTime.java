package java_eleven;

public class MakeTime {
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=0;i<30000000;i++){
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("caculate" + (endTime-startTime) + "毫秒");
	}
}
//此算法是计算运行此程序所需时间