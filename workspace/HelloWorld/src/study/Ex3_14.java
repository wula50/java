/**
 * @author: Ada
 * @content:将所有整型数值转换成int型，并输出
 * @date:   2020-08-12
 */
package study;


public class Ex3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=123;
		short s=123;
		long l=9876543211233455l;
		int i=0;
		i=b;
		System.out.println(i);
		i=s;
		System.out.println(i);
		// long直接转换int需要强制转换
		i=(int)l;
		System.out.println(i);
		
		

	}

}
