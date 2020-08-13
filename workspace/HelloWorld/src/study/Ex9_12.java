/**
 * @content:获取2~32之间（不包括32）的6个偶数，并取得这6个偶数的和
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

public class Ex9_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<6;i++) {
			int j=randomSix(2, 32);
			System.out.println(j);
			sum+=j;
			
		}
		System.out.println(sum);

	}
	
	static int randomSix(int begin,int end) {
		return begin+(int)(Math.random()*(end-begin));
	}

}
