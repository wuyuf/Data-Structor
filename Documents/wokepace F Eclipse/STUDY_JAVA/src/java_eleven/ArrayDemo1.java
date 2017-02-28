package java_eleven;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayDemo1 {
	public static void main(String arg[]){
		int temp[] = {3,4,5,6,7,8,9,5,3,};
		Arrays.sort(temp);
		System.out.print("排序后的数组：") ;
		System.out.println(Arrays.toString(temp));
		// 如果要想使用二分法查询的话，则必须是排序之后的数组
		int point = Arrays.binarySearch(temp, 3);
		System.out.println("元素‘3’的位置在：" + point) ;
		Arrays.fill(temp, 3);
		System.out.print("数组填充：") ;
		System.out.println(Arrays.toString(temp)) ;

	}
}
