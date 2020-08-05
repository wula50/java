
public class helloworld {
	public static void main(String[] args) {
		System.out.println("helloworld!");
		String str1="hello";
		System.out.print(str1+"world"=="hello"+"world");//str1+"world"会在堆内存中新建对象，返回地址值，“hello”和“world”是常量，建立在缓冲池中
		
	}

}