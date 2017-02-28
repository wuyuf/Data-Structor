package java_twelve;

import java.io.*;


public class SystemINOptimization {
	public static void main(String args[]) throws Exception{
		InputStream input = System.in;		//从键盘接收数据
		StringBuffer buf = new StringBuffer();		//使用StringBuffer接受内容
		System.out.println("please input data:");
		int temp = 0;	
		while((temp=input.read())!=-1){
			char c = (char) temp;		//make the data become the char(字符）
			if(c=='\n'){	//当输入回车的时候，停止输入并继续代码运行
				break;
			}
			buf.append(c);	//保存内容
		}
		System.out.println("输入的内容为" + buf);
		input.close();
	}
}

//收到长度的限制，当输入内容是中文的时候，则会发生乱码