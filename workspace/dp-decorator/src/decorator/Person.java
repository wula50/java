package decorator;

public class Person {
	public Person() {}
	
	private String nameString;
	public Person(String nameString) {
		this.nameString=nameString;
	}
	
	public void show() {
		System.out.printf("装扮的%s",nameString);
	}
}
