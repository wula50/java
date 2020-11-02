/**
 * @author: Ada
 * @content:判断奇数还是偶数
 * @date:   2020-08-12
 */
package study;
import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		if(i%2==0) {
			System.out.println(i+"是偶数");
		}else {
			System.out.println(i+"是基数");
		}
		scanner.close();

	}

}
