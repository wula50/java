/**
 * @author: Ada
 */
public class Operater {
	public static void main(String[] args) {
		
	    System.out.print(add(1,2));}
	    
		public static int add(int a,int b) {
			return a+b;
		}
		public static int sub(int a,int b) {
			return a-b;
		}
		public static int mul(int a,int b) {
			return a*b;
		}
		public static int div(int a,int b) {
			if(b!=0) {
				return a/b;
				
			}
			return -1;
	}

}
