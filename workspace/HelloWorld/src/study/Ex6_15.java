/**
 * @author: Ada
 * @content:将arr1数组索引位置是0~3中的元素赋值到arr2中
 * @date:   2020-08-12
 */
package study;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1= {'a','b','c','d','e'};
		char[] arr2=Arrays.copyOfRange(arr1, 0, 3);
		for(char c:arr1) {
			System.out.print(c+" ");
		}
		System.out.println("");
		for(char c:arr2) {
			System.out.print(c+" ");
		}
		

	}

}
