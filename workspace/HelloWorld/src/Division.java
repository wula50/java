
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="192.168.0.1";
		// .在正则里表示任意一个字符
		String[] firstArray=str.split("\\.");
		for(String s:firstArray) {
			System.out.println(s+"  ");
		}
		// 3次分割
		String[] secondArray=str.split("\\.",3);
		for(String s:secondArray) {
			System.out.println(s);
		}
		//\b  \t  \n  \f  \r  \"  \'  \\ 只有这些是转义字符
		System.out.println("\\.");
		

	}

}
