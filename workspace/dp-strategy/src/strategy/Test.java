package strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashContext cashContext=new CashContext("normal");
		System.out.println(cashContext.getResult(800));
		
		CashContext cashContext2=new CashContext("0.75");
		System.out.println(cashContext2.getResult(800));
		
		CashContext cashContext3=new CashContext("300-100");
		System.out.println(cashContext3.getResult(800));
	}

}
