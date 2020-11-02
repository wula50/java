/**
 * @author: Ada
 * @content:使用正则表达式判断字符串text是否为合法手机号
 * @date:   2020-08-12
 */
package study;

import java.util.Scanner;

public class Ex5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="1\\d{10}";
		Scanner s=new Scanner(System.in);
		String text=s.next();
		if(text.matches(regex)) {
			System.out.println("输入的是合法手机号");
		}else {
			System.out.println("输入的不是合法手机号");
		}
		s.close();

	}

}
