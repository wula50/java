package factory;

public class OpertaionDiv extends Operation {
	public double getResult() throws Exception {
		double result=0;
		if (getNumberB()==0) {
			throw new Exception("除数为0");
		}
		result=getNumberA()/getNumberB();
		return result;
	}
}
