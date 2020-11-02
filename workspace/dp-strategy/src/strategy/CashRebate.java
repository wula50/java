package strategy;

public class CashRebate extends CashSuper{
	private double rebate=1; 
	
	public CashRebate(double rebate) {
		this.rebate=rebate;
	}
	public double acceptCash(double money) {
		return money*rebate;
	}
}
