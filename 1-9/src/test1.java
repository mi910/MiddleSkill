public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int number1 = 5;
		int number2 = 9;
		System.out.println(number1 + number2);
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long longNumber = 1111111111;
		System.out.println(longNumber * 2);
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
		boolean isFalse ="test".equals("TEST");
		System.out.println(isFalse);
	}
}