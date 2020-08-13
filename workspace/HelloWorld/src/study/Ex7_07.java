/**
 * @content:矩形类，长宽为属性，构造方法中长宽初始化，定义方法求矩形面积
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

public class Ex7_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(3, 4);
		System.out.println(rectangle.areaRectangle());

	}

}

class Rectangle{
	private double width;
	
	private double length;
	
	
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	public double areaRectangle() {
		return width*length;
	}
}
