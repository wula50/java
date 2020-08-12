/**
 * @author: Ada
 * @content:计算1+1/2!+1/3!+...+1/20!
 * @date:   2020-08-12
 */
package study;

public class Ex4_16 {
	public static void main(String[] args) {
		double sum=0;
		
		int i=1;
		while(i<=20) {
			double mul=1;
			for(int j=1;j<=i;j++) {
				mul*=j;
			}
			sum+=1/mul;
			i++;
				
		}
		System.out.println(sum);
	}

}
