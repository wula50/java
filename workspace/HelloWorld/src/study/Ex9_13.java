/**
 * @content:定义一个求圆面积的方法，其中以圆半径作为参数，并将计算结果保留5位小数
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

import java.text.DecimalFormat;

public class Ex9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areaCircle(5)); 

	}
	
	static String areaCircle(double r) {
		double s=Math.PI*Math.pow(r, 2);
		DecimalFormat decimalFormat=new DecimalFormat("#####.#####");
		return decimalFormat.format(s);
		
	}

}
