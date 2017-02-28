package java_eleven;

import java.util.* ;
class Students{	// 指定类型为Student
	private String name ;
	private int age ;
	public Students(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public boolean equals(Object obj){	// 覆写equals方法
		if(this==obj){
			return true ;
		}
		if(!(obj instanceof Students)){
			return false ;
		}
		Students stu = (Students) obj ;
		if(stu.name.equals(this.name)&&stu.age==this.age){
			return true ;
		}else{
			return false ;
		}
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public String toString(){
		return name + "\t\t" + this.age  ;
	}
};

class StudentsComparator implements Comparator<Students>{	// 实现比较器
	// 因为Object类中本身已经有了equals()方法
	public int compare(Students s1,Students s2){
		if(s1.equals(s2)){
			return 0 ;
		}else if(s1.getAge()<s2.getAge()){	// 按年龄比较
			return 1 ;
		}else{
			return -1 ;
		}
	}
};

public class ComparatorDemo{
	public static void main(String args[]){
		Students stu[] = {new Students("张三",20),
			new Students("李四",22),new Students("王五",20),
			new Students("赵六",20),new Students("孙七",22)} ;
		java.util.Arrays.sort(stu,new StudentsComparator()) ;	// 进行排序操作
		for(int i=0;i<stu.length;i++){	// 循环输出数组中的内容
			System.out.println(stu[i]) ;
		}
	}
};