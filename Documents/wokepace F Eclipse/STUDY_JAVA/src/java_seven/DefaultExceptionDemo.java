package java_seven;


class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class DefaultExceptionDemo {
    public static void main(String args[]){
    	try{
    		throw new Exception("自定义异常");
    	}catch(Exception e){
    		System.out.println(e);
    	}
    }
}
