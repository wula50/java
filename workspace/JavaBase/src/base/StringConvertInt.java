package base;
/**
 * 
 * @description：字符串转换成数值
 * @author: Ada
 * @package:base
 * @date:   Aug 29, 202010:03:55 AM
 */
public class StringConvertInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第二个参数为基数，也就是进制，可以实现任何进制到十进制的转
		int i=Integer.parseInt("11111111",4);
		System.out.println(i);
		//转换为无符号，参数只能是+开头的数
		//int j=Integer.parseUnsignedInt("-222222");
		int j=Integer.parseUnsignedInt("+11111");
		System.out.println(j);
		
		double d=Double.parseDouble("123.456");
		System.out.println(d);
		
		float f=Float.parseFloat("12.56");
		System.out.println(f);

	}

}
