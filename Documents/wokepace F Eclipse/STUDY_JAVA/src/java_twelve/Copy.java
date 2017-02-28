package java_twelve;

import java.io.*;
public class Copy {
	public static void main(String args[]){
		if(args.length!=2){		// 判断是否是两个参数
			System.out.println("输入的参数不正确。") ;
			System.out.println("例：java Copy 源文件路径 目标文件路径") ;
			System.exit(1) ;	// 系统退出
		 }
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		if(!f1.exists()){	//判断文件是否存在
			System.out.println("源文件不存在！") ;
			System.exit(1) ;
		}
		InputStream input = null;
		OutputStream out = null; 
		try {
			input = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out = new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(input!=null&&out!=null){
			int temp = 0;
			try {
				while((temp=input.read())!=-1){		//开始拷贝
					out.write(temp);
				}
				System.out.println("拷贝完成！") ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("拷贝失败！") ;

			}
			try {
				input.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
