/**
 * @content:通过字符型变量创建boolean值，再将其转换成字符串输出，观察输出后的字符串
 * 与创建Boolean对象时给定的参数是否相同
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

public class Ex8_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean boolean1=new Boolean("True");
		System.out.println(boolean1.toString());
		System.out.println(boolean1);
		Boolean boolean2=new Boolean("");
		System.out.println(boolean2);

	}

}
