package java_TEN;

class InfoNest<T,V>{
	private T var;
	private V value;
	public InfoNest(T var,V value){
		this.setVar(var);
		this.setValue(value);
	}
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

class Demoo<S>{
	private S info;
	public Demoo(S info){
		this.setInfo(info);
		
	}
	public S getInfo() {
		return info;
	}
	public void setInfo(S info) {
		this.info = info;
	}
}
public class GenericsNest {
	public static void main(String args){
		Demoo<InfoNest<String,Integer>> d = null;
		InfoNest<String,Integer> i = null;
		i = new InfoNest<String,Integer>("sf",20);
		d = new Demoo<InfoNest<String,Integer>>(i);
		System.out.println("内" + d.getInfo().getVar());
		System.out.println("内" + d.getInfo().getValue());

	}
}
