/**
 * @author: Ada
 * @content:打印菱形
 * @date:   2020-08-12
 */
package study;

public class Ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
			
		}*/
		int i,j,k,m;
		for(i=-3;i<=3;i++) {
			for(j=1;j<=Math.abs(i);j++) {
				System.out.print(" ");
			}
			k=7-2*Math.abs(i);
			for(m=1;m<=k;m++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
