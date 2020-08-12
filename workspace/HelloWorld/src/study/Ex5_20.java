/**
 * @author: Ada
 * @content:截取两个字符串的子串，不区分大小比较是否相同
 * @date:   2020-08-12
 */
package study;

public class Ex5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdefg";
		String str2="aBcdddd";
		boolean b=false;
		// 从第一个参数到第二个参数，包含第二个参数
		b=str1.substring(0, 4).equalsIgnoreCase(str2.substring(0,4));
		if(b) {
			System.out.println("两个子串相同");
		}else {
			System.out.println("两个子串不相同");
		}
		
		

	}

}
