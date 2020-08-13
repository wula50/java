/**
 * @content:定义成员变量，并定义访问和设置的方法
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

public class Ex7_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.setName(100);
		int n=test.getName();
		System.out.println(n);

	}

}


class Test{
	private int name;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	
}
