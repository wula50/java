package strategy;

public class CashReturn extends CashSuper{
	
	private double money=0;
	private double mreturn=0;
	public CashReturn(double money,double mreturn) {
		this.money=money;
		this.mreturn=mreturn;
	}
	public double acceptCash(double money) {
		double result=money;
		if(money>this.money) {
			result=money-Math.floor(money/this.money)*mreturn;
		}
		return result;
	}
}
