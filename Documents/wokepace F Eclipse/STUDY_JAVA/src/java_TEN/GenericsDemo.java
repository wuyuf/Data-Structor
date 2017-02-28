package java_TEN;


class Address<T>{
	private T var;
	public Address(T var){
		this.var = var;
	}
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var = var;
	}
}
public class GenericsDemo {
	public static void main(String args[]){
		Address<String> p = new Address<String>("WHDJFK");
		System.out.println("contents" + p.getVar());
	}
}
