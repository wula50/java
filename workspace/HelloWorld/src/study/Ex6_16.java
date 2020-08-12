/**
 * @author: Ada
 * @content:将数组中最小的输出
 * @date:   2020-08-12
 */
package study;

public class Ex6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {100,79,48,9,45,8};
		int min=arr1[0];
		for(int i=1;i<arr1.length;i++) {
			if(min>arr1[i]) {
				min=arr1[i];
			}
		}
		System.out.println("数组中最小的值是："+min);

	}

}
