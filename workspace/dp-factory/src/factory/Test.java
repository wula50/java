package factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation operation=OpertaionFactory.createOperate("/");
		operation.setNumberA(5);
		operation.setNumberB(0);
		
		try {
			System.out.println(operation.getResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
