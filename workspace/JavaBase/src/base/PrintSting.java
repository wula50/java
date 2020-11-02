package base;
/* *
 * description:
 * 1、引用传值，string类型虽然引用传值，但string类型不能改变，故值不变
 * 2、println方法重载中的一种，参数类型为char，故可以直接输出
 * 3、toString()的用法
 */
public class PrintSting {

	public static void change(String s,char[] c) {
		s="hello";
		//修改c的值
		//c=new char[]{'w','o','r','l','d'};
		//错误的赋值方法，这种赋值方法只能放在初始化
		//c={'w','o','r','l','d'};
		//更改数组元素的值
		c[0]='a';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] A= {'a','b','c'};
		String[] B= {"abc","cde","fgh"};
		//println方法重载中，有一种类型就是char[]
		System.out.println(A);
		System.out.println(B);
		
		String s="java";
		char[] c={'l','a','n','g','u','a','g','e'};
		change(s, c);
		System.out.println(s);
		System.out.println(c);
		
		int i=10;
		Integer integer=i;
		//对象.toString()或者类.toString(i)都可以，详情查API
		System.out.println(integer.toString()); 
		System.out.println(Integer.toString(i));
	}

}
