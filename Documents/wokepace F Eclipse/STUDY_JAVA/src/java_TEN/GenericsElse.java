package java_TEN;


interface Infom<T>{
	public T getVar();
}
class InfoImpl<T> implements Infom<T>{	// 定义泛型接口的子类
	private T var ;				// 定义属性
	public InfoImpl(T var){		// 通过构造方法设置属性内容
		this.setVar(var) ;	
	}
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
};
/*class InfoImpl implements Info<String>{
	private String var;
	piblic InfoImpl(String var){
		this.setVar(var);
	}
	public void setVar(T var){
		this.var = var ;
	}
	public String getVar(){
		return this.var ;
	}
}		//第二种写法
*/
public class GenericsElse {
	public static void main(String args[]){
		Infom<String> i = null;
		i = new InfoImpl<String>("圣诞节");
				System.out.println("内容" + i.getVar());
	}
}
/*public class GenericsElse {
	public static void main(String args[]){
		Info i  = null;
		i = new InfoImpl("dsf");
		System.out.println("内容：" + i.getVar()) ;
	}
}			//第二种
*/

