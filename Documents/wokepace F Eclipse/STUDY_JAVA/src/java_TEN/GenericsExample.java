package java_TEN;

interface Inform{
	
}

class Contact implements Inform{
	private String address;
	private String telphone;
	private String zipcode;
	public Contact(String address,String telphone,String zipcode){
		this.setAddress(address);
		this.setTelphone(telphone);
		this.setZipcode(zipcode);
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String toString(){
		return "联系方式" + this.telphone + "\t" +
			   "联系地址" + this.address +  "\t" +
			   "邮政编码" + this.zipcode   ;
			   
	}
}

class Introduction implements Inform{
	private String name;
	private String sex;
	private int age;
	public Introduction(String name,String sex,int age){
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "姓名" + this.name + "\t" +
			   "年龄" + this.age +  "\t" +
			   "性别" + this.sex   ;
			   
	}
}
class Person<T extends Inform>{
	private T info;
	public Person(T info){
		this.setInfo(info);
	}
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	public String toString(){
		return this.info.toString();
	}
}
/*
public class GenericsExample {   		//将联系方式作为基本信息
	public static void main(String args[]){
		Person<Contact> per = null;
		per  = new Person<Contact>(new Contact("da","23490","2342445"));
		System.out.print(per);
	}
}
*/

public class GenericsExample {   		//将基本信息作为基本信息
	public static void main(String args[]){
		Person<Introduction> per = null;
		per = new Person<Introduction>(new Introduction("wueyfusa","dfhsj",12));
		System.out.println(per);
	}
}
