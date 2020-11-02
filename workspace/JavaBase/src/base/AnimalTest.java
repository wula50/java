package base;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		// class base.Dog
		System.out.println(animal.getClass());;
		animal.call();
		//Dog实例不能转换Cat实例
		//Cat cat=(Cat)animal;
		Cat cat;
		//instancof 必须初始化cat
		//System.out.println(cat instanceof Animal);
		//cat.call();
	}

}
abstract class Animal{
	abstract void call();
}
class Cat extends Animal{
	void call() {
		System.out.println("miaomiao...");
	}
}
class Dog extends Animal{
	void  call() {
		System.out.println("wangwang...");
	}
}
//class Person{
//	
//}