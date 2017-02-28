package java_TEN;


class Info<T>{
	private T var ;		// 定义泛型变量
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
	public String toString(){	// 直接打印
		return this.var.toString() ;
	}
};
public class GenericsLast{
	public static void main(String args[]){
		Info<Integer> i1 = new Info<Integer>() ;		// 声明Integer的泛型对象
		i1.setVar(30) ;
		
		fun(i1) ;
	}
	public static void fun(Info<Integer> i1){	// 只能接收String或Object类型的泛型
		System.out.print(i1 + "、") ;
	}
};