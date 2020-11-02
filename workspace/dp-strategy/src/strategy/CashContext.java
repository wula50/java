package strategy;

public class CashContext {
	private CashSuper cashSuper;
	
	//策略模式混合工厂模式
	public CashContext(String type) {
		switch (type) {
		case "normal":
			cashSuper=new CashNormal();
			break;
		case "300-100":
			cashSuper=new CashReturn(300, 100);
			break;
		case "0.75":
			cashSuper=new CashRebate(0.75);
			break;
		default:
			break;
		}
	}
	
	//策略模式
	public CashContext(CashSuper cashSuper) {
		this.cashSuper=cashSuper;
	}
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
