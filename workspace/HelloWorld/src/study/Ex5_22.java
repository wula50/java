/**
 * @author: Ada
 * @content:使用字符串生成器，将字符串str追加1~10这10个数字
 * @date:   2020-08-12
 */
package study;

public class Ex5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		StringBuilder sBuilder=new StringBuilder();
		for(int i=1;i<=10;i++) {
			sBuilder.append(i);
		}
		str=sBuilder.toString();
		System.out.println(str);

	}

}
