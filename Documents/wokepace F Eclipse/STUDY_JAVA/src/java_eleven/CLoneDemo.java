package java_eleven;


class Persons implements Cloneable{
	private String name ;
	public Persons(String name){
		this.name = name ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public String toString(){
		return "姓名：" + this.name ;
	}
	public Object clone()
	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class CLoneDemo {
	public static void main(String args[]) throws Exception{
		Persons p1 = new Persons("张三") ;
		Persons p2 = (Persons)p1.clone() ;
		System.out.println("原始对象：" + p1) ;
		System.out.println("克隆之后的对象：" + p2) ;
	}
}
