/**
 * @content:创建两个Character对象，通过equals方法比较二者是否相等，再转换成小写
 * 形式，比较二者是否相等
 * @author: Ada
 * @date:   2020-08-13
 */
package study;

public class Ex8_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character1=new Character('A');
		Character character2=new Character('a');
		boolean b=character1.equals(character2);
		System.out.println(b);
		Character.toLowerCase(character1);
		//character1.toLowerCase('A');
		b=character1.equals(character2);
		System.out.println(b);
		

	}

}
