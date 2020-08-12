/**
 * @author: Ada
 * @content:比较成员变量age和局部变量name，并注释说明
 * @date:   2020-08-12
 */
package study;

public class Ex3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// name局部变量
		int name=0;
		showName();
		showAge();

	}
	// age成员变量
	static int age=0;
	
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Ex3_13.age = age;
	}

	static void showName() {
		//name cannot be resolved to a variable
		//System.out.println(name);
	}
	
	static void showAge() {
		System.out.println(age);
	}

}
