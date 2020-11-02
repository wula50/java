/**
 * @author: Ada
 * @content:大小写转换
 * @date:   2020-08-12
 */
package study;
import java.util.Scanner;

public class Ex5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		System.out.println("转换为大写："+str.toUpperCase());
		System.out.println("转换为小写："+str.toLowerCase());
		scanner.close();

	}

}
