/**
 * @author: Ada
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("helloworld!");
		String str1="hello";
		//str1+"world"会在堆内存中新建对象，返回地址值，“hello”和“world”是常量，建立在缓冲池中
		System.out.print(str1+"world"=="hello"+"world");
	}
public HelloWorld() {
	// TODO Auto-generated constructor stub
	System.out.print(false);
	int a=0;
	int b=0;
	int c=a+b;
	System.out.print(c);
	System.out.println();
}
}