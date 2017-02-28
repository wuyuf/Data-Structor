package java_five;

class Check{
	public boolean validate(String name,String password){
		if(name.equals("wyf")&&password.equals("wyf")){
			return true;
		  }else{
			  return false;
		}
	}
}
class Operate{
	private String info[];   //定义一组数组属性，用于接受全部参数输入	
		public Operate	(String info[]){
		this.info = info;        //通过构造方法，获取全部输入参数
	}
	public String login() {
		Check check = new Check();
		this.isExit();
		String str = null;
		String name = this.info[0];
		String password = this.info[1];
		if(check.validate(name, password)){
			str = "欢迎"+name+"光临";
		}else{
			str = "用户名或密码错误，请重新输入！！";
		}
		return str;
	}
	public void isExit(){
		if(this.info.length!=2){
			System.out.println(" 输入格式不正确");
			System.out.println("格式 LoginDemo 用户名 密码");
			System.exit(1);
		}
	}
}
public class LoginDemo {
	public static void main(String args[]){
		Operate oper = new Operate(args);//实例化操作的对象
			System.out.println(oper.login());//取得验证之后的信息
		}
}




