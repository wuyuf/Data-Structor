package java_TEN;

class Infor<T extends Number>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	public String toString(){	// 覆写Object类中的toString()方法
		return this.var.toString();
	}
}
public class GenericsMethod {
	public static void main(String args[]){
		Infor<Integer> i = fun(30);
		System.out.println(i.getVar());
	}
	public static <T extends Number> Infor<T> fun(T param){
		Infor<T> temp = new Infor<T>();
		temp.setVar(param);
		return temp;
	}
}
