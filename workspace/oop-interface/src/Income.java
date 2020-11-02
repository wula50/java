import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 定义接口Income
 */
public interface Income {

	//double income=0;//相当于是常量，不能修改其值
	// TODO
	double getTax();
	

}
class BasicIncome implements Income{
	protected double income;
	public BasicIncome(double income) {
		this.income=income;
	}
	public double getTax() {
		return income*0.1;
	}
}
