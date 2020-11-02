/**
 * 静态属性的访问
 * 子类转换为父类
 */
package base;


public class TestStatic {
    public static String s="a";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic testStatic=new TestStatic();
	    SubStatic subStatic=new SubStatic();
	    //使用对象访问静态属性
	    System.out.println(testStatic.s);
	    System.out.println(subStatic.s);
	    //使用类名访问静态属性
	    System.out.println(TestStatic.s);
	    System.out.println(SubStatic.s);
	    
	    System.out.println(((TestStatic)subStatic).s);

	}

}
class SubStatic extends TestStatic{
	public static String s="v";
}
