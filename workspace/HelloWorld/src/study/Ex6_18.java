/**
 * @author: Ada
 * @content:将二维数组中的行列互调显示出来
 * @date:   2020-08-12
 */
package study;

public class Ex6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int j = 0; j <3;j++) {
			for (int i : arr[j]) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}