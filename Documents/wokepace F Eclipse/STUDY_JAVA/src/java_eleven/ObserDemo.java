package java_eleven;

import java.util.*;

class House extends Observable{	//表示房子可以被观察
	private float price;
	public House(float price){
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	public String toString(){
		return "this house price" + this.price;
	}
}
class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){	//设置每一个购房者的名字
		this.name = name;
	}
	public void update(Observable o,Object arg){
		if(arg instanceof Float){
		System.out.println(this.name + "the price instance of:");
		System.out.println(((Float)arg).floatValue());
		}
	}
}
public class ObserDemo {
	public static void main(String args[]){
		House h = new House(10000);
		HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
		HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
		HousePriceObserver hpo3 = new HousePriceObserver("购房者");
		h.addObserver(hpo1) ;
		h.addObserver(hpo2) ;
		h.addObserver(hpo3) ;
		System.out.println(h) ;	// 输出房子价格
		h.setPrice(666666) ;	// 修改房子价格
		System.out.println(h) ;	// 输出房子价格
	}
}
