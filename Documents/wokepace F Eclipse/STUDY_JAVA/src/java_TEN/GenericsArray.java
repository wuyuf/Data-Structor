package java_TEN;

class Infou<T>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	   public String toString(){
		   return this.var.toString();
	   }
}

public class GenericsArray {
	public static void main(String args[]){
		Infou<String> i1 = new Infou<String>();
		Infou<String> i2 = new Infou<String>();
		i1.setVar("HELLO");
		i2.setVar("sd");
		add(i1,i2);
	}
	public static <T> void add(Infou<T> i1,Infou<T> i2){
		System.out.println(i1.getVar() + " " + i2.getVar());;
	}
}
