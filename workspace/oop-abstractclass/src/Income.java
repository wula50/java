import java.util.Base64;

/**
 * 定义抽象类Income
 */
public abstract class Income {

	// TODO
	protected double income;
	public Income(double income) {
		this.income=income;
	}
	abstract public double getTax();

}
class BasicIncome extends Income{
	public BasicIncome(double income) {
		super(income);
	}
	public double getTax() {
		return income*0.1;
		
	}
}
