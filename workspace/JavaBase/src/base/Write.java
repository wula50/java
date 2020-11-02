package base;
/**
 * 
 * @description：
 * 1、有效的重写，方法名、参数列表、返回类型均相同，不能定义仅返回类型不同，方法名和参数列表相同的重写
 * 2、instanceof的用法
 * 3、直接调用父类的静态方法
 * @author: Ada
 * @package:base
 * @date:   Aug 29, 20209:03:58 AM
 */
public class Write {
	public  static void main(String args[]) {
		Student student=new Student();
		Person1 person1=new Person1();
	    Person1 person12=new Student();
		//true 前面对象的类型是后面类的子类
		System.out.println(student instanceof Person1); 
		//false 
		System.out.println(person1 instanceof Student);
		//true
		System.out.println(person12 instanceof Person1);
		System.out.println(person12 instanceof Student);
		//student 和 String 不能比较
		//System.out.println(student instanceof String);
		student.name();
	}

}
class Person1{
	public void a() {
		System.out.println("person1 a");
	} 
	public void ini(int x,int y) {
		System.out.println("person");
	}
	public static void staticMethod() {
		System.out.println("person1 staticmethod.");
	}
}
class Student extends Person1{
	//不能缩小父类的方法的范围
//	protected void a() {
//		System.out.println("student a");
//	}
	//放大范围可以
	@Override
	public void ini(int x,int y) {
		
	}
	//参数列表不同，不是重写
	public void ini(int x) {
	}
	//参数列表不同，不是重写
	public void ini()throws Exception{}
	//若参数列表相同，返回类型是父类方法返回类型的子类
//	public int ini(int x,int y) {
//		return 0;
//	}
	public void name() {
		System.out.println("call person1 static method");
		//父类的静态方法，不用类名，可以直接调用
		staticMethod();
		
	}
	
	
}
