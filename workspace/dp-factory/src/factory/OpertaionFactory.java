package factory;

public class OpertaionFactory {
   public static Operation createOperate(String operString) {
	   Operation operation=null;
	   switch (operString) {
	case "+" :
		operation=new OperationAdd();
		break;
	case "-":
		operation=new OperationSub();
		break;
	case "*":
		operation=new OperationMul();
		break;
	case "/":
		operation=new OpertaionDiv();
		break;
	default:
		break;
	}
	   return operation;
   }
}
