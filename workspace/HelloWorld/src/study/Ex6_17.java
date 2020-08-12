/**
 * @author: Ada
 * @content:将索引位置是2的元素替换为”bb“
 * @date:   2020-08-12
 */
package study;

import java.util.Arrays;

public class Ex6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String[8];
		Arrays.fill(arr, "a");
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		arr[2]="bb";
		for(String s:arr) {
			System.out.print(s+" ");
		}
		

	}

}
