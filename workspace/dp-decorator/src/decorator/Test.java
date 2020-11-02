package decorator;

public class Test {
	public static void main(String[] arg) {
		Person person = new Person("小牛");

		LeatherShoes leatherShoes = new LeatherShoes();
		Suit suit = new Suit();
		TShirts tShirts = new TShirts();

		leatherShoes.decorate(person);
		suit.decorate(leatherShoes);
		tShirts.decorate(suit);
		tShirts.show();
	}

}
